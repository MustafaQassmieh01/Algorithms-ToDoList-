package toDoList;

public class ExpectedTime {
    int minutes;
    int hours;

    public ExpectedTime(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return String.format("%d:%02d",hours ,minutes);
    }
    public int[] getTime(){
        return new int[]{hours, minutes};
    }

}
