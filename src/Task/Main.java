package Task;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Java Collections","Write List","Ann",Status.ASSIGNED,Priority.LOW);
        Task task2 = new Task("Java Collections", "Write Set",
                "Bob",Status.ASSIGNED, Priority.LOW);
        Task task3 = new Task("Java Collections", "Write LinkedList",
                "Carol", Status.ASSIGNED, Priority.LOW);
        Task task4 = new Task("Java Collections", "Write Map",
                "Bob", Status.ASSIGNED, Priority.LOW);
        Task task5 = new Task("Java Collections", "Write ArrayList",
                "Ann", Status.ASSIGNED, Priority.LOW);
        Task task6 = new Task("Java Collections", "Write List in Set",
                "", Status.IN_QUEQUE, Priority.MEDIUM);
        Task task7 = new Task("Java Collections", "Write ArrayList",
                "Bob", Status.IN_QUEQUE, Priority.MEDIUM);
        Set<Task> totalTasks = new HashSet<>();
        totalTasks.add(task1);
        totalTasks.add(task2);
        totalTasks.add(task3);
        totalTasks.add(task4);
        totalTasks.add(task5);
        totalTasks.add(task6);

        totalTasks.add(task7);
        Set<Task> annsTask = new LinkedHashSet<>();
        annsTask.add(task1);
        annsTask.add(task5);

        Set<Task> bobsTask = new LinkedHashSet<>();
        bobsTask.add(task2);
        bobsTask.add(task4);

        Set<Task> carolsTask = new LinkedHashSet<>();
        carolsTask.add(task3);
        carolsTask.add(task7);

        Set<Task> unassignedTasks = new HashSet<>();
        unassignedTasks.add(task6);

        TaskData taskData = new TaskData(annsTask, bobsTask, carolsTask);

        System.out.println("All tasks: ");
        System.out.println(taskData.getTasks("all"));

        System.out.println("***********************");

        System.out.println("Ann's task: ");
        System.out.println(taskData.getTasks("ann"));
        System.out.println("***********************");

        System.out.println("Bob's task: ");
        System.out.println(taskData.getTasks("bob"));
        System.out.println("***********************");

        System.out.println("Carol's task: ");
        System.out.println(taskData.getTasks("carol"));
        System.out.println("***********************");

        System.out.println(taskData.getDifference(totalTasks, taskData.getTasks("all")));
        
    }
}
