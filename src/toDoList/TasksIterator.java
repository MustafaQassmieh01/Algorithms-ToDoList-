package toDoList;

import java.util.Iterator;

public class TasksIterator implements Iterator<Task> {
    private Task[] tasks;
    int index = 0;
    public TasksIterator(Task[] tasks){
        this.tasks = tasks;
    }


    @Override
    public boolean hasNext() {
        if (index < tasks.length){
            return true;
        }
        return false;
    }

    @Override
    public Task next() {
        if (tasks[index] == null) {
            index ++;
            return this.next();
            // you can also implement a while loop that basically achieves the same thing but this looks cooler.
        }
        if (hasNext()){
            return tasks[index++];
        }
        throw new IndexOutOfBoundsException();
    }
}
