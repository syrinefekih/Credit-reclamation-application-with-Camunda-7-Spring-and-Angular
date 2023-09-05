package com.example.ReclamTestFlowProject.tasks;

import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class RejetHandler implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        TaskService taskService = execution.getProcessEngineServices().getTaskService();
        logger.info("Rejet demande");

    }
}
