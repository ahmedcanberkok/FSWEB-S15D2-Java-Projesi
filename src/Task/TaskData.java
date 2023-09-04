package Task;

import java.util.HashSet;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTask = new HashSet<>();
    private Set<Task> bobsTask = new HashSet<>();
    private Set<Task> carolsTask = new HashSet<>();

    public TaskData(Set<Task> annsTask, Set<Task> bobsTask, Set<Task> carolsTask) {
        this.annsTask = annsTask;
        this.bobsTask = bobsTask;
        this.carolsTask = carolsTask;
    }

    public Set<Task> getAnnsTask() {
        return annsTask;
    }

    public void setAnnsTask(Set<Task> annsTask) {
        this.annsTask = annsTask;
    }

    public Set<Task> getBobsTask() {
        return bobsTask;
    }

    public void setBobsTask(Set<Task> bobsTask) {
        this.bobsTask = bobsTask;
    }

    public Set<Task> getCarolsTask() {
        return carolsTask;
    }

    public void setCarolsTask(Set<Task> carolsTask) {
        this.carolsTask = carolsTask;
    }

    public Set<Task> getTasks(String employee) {
        switch (employee) {
            case ("ann"):
                    return  annsTask;
            case ("bob"):
                    return  bobsTask;
            case ("carol"):
                    return carolsTask;
            case ("all"):
                Set<Task> allTask = new HashSet<>();
                allTask.addAll(annsTask);
                allTask.addAll(bobsTask);
                allTask.addAll(carolsTask);
                return allTask;
            default:
                return null;
        }
    }

    //BİRLEŞİM İŞLEMİ
    public  Set<Task> getUnion (Set<Task>... unionTask) {
        Set<Task> unions = new HashSet<>();
        for (Set<Task> tasks: unionTask) {
            unions.addAll(tasks) ;
        }
        return unions ;
    }

    //KESİŞİM İŞLEMİ
    public  Set<Task> getIntersect(Set<Task> task1, Set<Task> task2) {
        Set<Task> intersection = new HashSet<>(task1);
        intersection.retainAll(task2);

        return intersection;
    }

    //FARK İŞLEMİ

    public Set<Task> getDifference(Set<Task> task1, Set<Task> task2) {
        Set<Task> differentiation = new HashSet<>(task1);
        differentiation.removeAll(task2);

        return differentiation;
    }
}
