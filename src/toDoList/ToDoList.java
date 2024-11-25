package toDoList;

import java.util.Iterator;
import java.util.List;

public class ToDoList implements Iterable {
    int size = 10;
    private Task[] tasks = new Task[size];
    private int index;

    @Override
    public Iterator iterator() {
        return new TasksIterator(tasks);
    }
    public void add(Task task){
        int i = 0;

        while (i< tasks.length&&tasks[i] != null) {
            i++;
        }
        if (i >= (tasks.length-5)){
            size +=6;
            Task[] newArray = new Task[size];
            System.arraycopy(tasks,0,newArray,0,size);
            this.tasks = newArray;
        }
        tasks[i] = task;
    }

}
