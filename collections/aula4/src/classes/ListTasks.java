package classes;

import java.util.ArrayList;
import java.util.List;

public class ListTasks {
    private List<Task> tasks;

    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
        System.out.println("Task added to tasks list");
    }

    public void removeTask(String description) {
        Task task = new Task(description);
        if(!tasks.contains(task)) {
            throw new RuntimeException("This task not exists");
        }
        tasks.remove(task);
    }

    public void getTotalOfTasks() {
        System.out.println(tasks.size() + " Tasks");
    }

    public void getDescriptionOfTasks() {
        List<String> tasksDescriptions = new ArrayList<>();
        for(Task task : this.tasks) {
            String taskDescription = task.getDescription();
            tasksDescriptions.add(taskDescription);
        }
    }
}
