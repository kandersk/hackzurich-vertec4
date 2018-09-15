/*
 * HackZurich'18 Vertec 4.0
 * API for the HackZurich'18 Vertec 4.0 Project
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Task;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskApi
 */
@Ignore
public class TaskApiTest {

    private final TaskApi api = new TaskApi();

    
    /**
     * Add a new task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTaskTest() throws ApiException {
        Task body = null;
        api.createTask(body);

        // TODO: test validations
    }
    
    /**
     * Deletes a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTaskTest() throws ApiException {
        String taskId = null;
        api.deleteTask(taskId);

        // TODO: test validations
    }
    
    /**
     * Find task by ID
     *
     * Returns a single task
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskByIdTest() throws ApiException {
        String taskId = null;
        Task response = api.getTaskById(taskId);

        // TODO: test validations
    }
    
    /**
     * Finds all the tasks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readTasksTest() throws ApiException {
        List<Task> response = api.readTasks();

        // TODO: test validations
    }
    
    /**
     * Updates a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTaskTest() throws ApiException {
        String taskId = null;
        Task body = null;
        api.updateTask(taskId, body);

        // TODO: test validations
    }
    
}
