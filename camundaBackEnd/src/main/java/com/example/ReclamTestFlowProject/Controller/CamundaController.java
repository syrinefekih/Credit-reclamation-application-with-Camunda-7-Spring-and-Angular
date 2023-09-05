package com.example.ReclamTestFlowProject.Controller;
import org.camunda.bpm.engine.*;
import org.camunda.bpm.engine.history.HistoricProcessInstance;
import org.camunda.bpm.engine.history.HistoricTaskInstance;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.task.Task;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class CamundaController {
    protected static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CamundaController.class);
    @Autowired
    private TaskService taskService;

    @Autowired
    private ProcessEngine processEngine;

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private HistoryService historyService;

    //Get all the reclam ids **as business keys** depending on the assignee of the corresponding active tasks
    @GetMapping("/tasks/{assignee}")
    public ArrayList<String> getTasksByAssignee(@PathVariable String assignee) {
        List<Task> tasks = taskService.createTaskQuery().active().taskAssignee(assignee).list();
        ArrayList<String> reclamIds= new ArrayList<>();
        for(Task task:tasks){
            reclamIds.add(runtimeService.createProcessInstanceQuery()
                    .processInstanceId(task.getProcessInstanceId())
                    .singleResult().getBusinessKey());
        }
        return reclamIds;
    }

    @GetMapping("/allTasks")
    public ArrayList<String> getAllTasksByAssignee() {
        List<HistoricTaskInstance> historicTasks = historyService.createHistoricTaskInstanceQuery()
                .finished()
                .list();
        List<HistoricProcessInstance> completedProcessInstances = historyService.createHistoricProcessInstanceQuery()
                .processDefinitionKey("reclamCredit")
                .finished()
                .list();
        ArrayList<String> reclamIds = new ArrayList<>();
        for (HistoricProcessInstance processInstance : completedProcessInstances) {
            reclamIds.add(processInstance.getBusinessKey());
            LOGGER.info(processInstance.getBusinessKey());
        }
        return reclamIds;
    }

    //Lancer un process instance with business key = idReclamation //
    @PostMapping("/start-process")
    public String startProcess(@RequestBody String idReclamation) {
        ProcessInstance processInstance = processEngine.getRuntimeService()
                .startProcessInstanceByKey("reclamCredit",idReclamation);

        LOGGER.info("id process "+ processInstance.getId());
        LOGGER.info("Business key"+  processInstance.getBusinessKey());
        return processInstance.getId();
    }

    //Accomplish USER TASK TRAITEMENT CRC //
    @PostMapping("/complete-task/{idReclamation}/{idEtape}")
    public String completeTask(@PathVariable String idReclamation,@PathVariable String idEtape) {
        Task task = taskService.createTaskQuery()
                .processInstanceBusinessKey(idReclamation)
                .taskDefinitionKey("TraitementCRC")
                .singleResult();
        LOGGER.info("Etape "+task.getName());

        if (task != null) {
            taskService.complete(task.getId(), Map.of("idEtape", idEtape));
            return "Task completed";
        } else {
            return "Task not found";
        }
    }

    //Accomplish USER TASK traitement back office
    @PostMapping("/traitementBackOffice/{idReclamation}/{idEtape}")
    public String traitementBackOffice(@PathVariable String idReclamation,@PathVariable String idEtape) {
        Task task = taskService.createTaskQuery()
                .processInstanceBusinessKey(idReclamation)
                .taskDefinitionKey("TraitementBO")
                .singleResult();
        LOGGER.info("traitement etape " + task.getName());

        if (task != null) {
            taskService.complete(task.getId(),Map.of("idEtape", idEtape));
            return "Task completed";
        } else {
            return "Task not found";
        }
    }

    //Accomplish USER TASK Modification de reclamation
    @PostMapping("/modifierReclamTask/{idReclamation}")
    public String modifierReclam(@PathVariable String idReclamation) {
        Task task = taskService.createTaskQuery()
                .processInstanceBusinessKey(idReclamation)
                .taskDefinitionKey("Modification")
                .singleResult();
        LOGGER.info("traitement etape "+task.getName());

        if (task != null) {
            taskService.complete(task.getId());
            return "Task completed";
        } else {
            return "Task not found";
        }
    }
}