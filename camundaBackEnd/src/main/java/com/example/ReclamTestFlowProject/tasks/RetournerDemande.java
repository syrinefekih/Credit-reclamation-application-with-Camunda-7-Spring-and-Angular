package com.example.ReclamTestFlowProject.tasks;

import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;
@Component

public class RetournerDemande implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        TaskService taskService = execution.getProcessEngineServices().getTaskService();
//        execution.setVariable("idEtape", 17);
        logger.info("Retourner reclamation vers agence ..");
    }
}
