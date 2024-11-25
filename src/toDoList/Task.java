package toDoList;

public class Task {
    private String task;
    private ExpectedTime timer;

    private String discription;

    public Task(String task, ExpectedTime timer){
        this.task= task;
        this.timer = timer;
    }

    public ExpectedTime getTimer() {
        return timer;
    }

    public String getTask() {
        return task;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setTimer(ExpectedTime timer) {
        this.timer = timer;
    }
}
