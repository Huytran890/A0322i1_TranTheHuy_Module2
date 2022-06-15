package ss04_class_and_object.bai_tap;

import java.util.Scanner;

public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch() {
        this.startTime = 0;
        this.endTime = 0;
    }

    public StopWatch(double startTime, double endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setStartTime(double startTime) {
        if (startTime <= 0)
            this.startTime = 12;
        else
            this.startTime = startTime;
    }

    public void setEndTime(double endTime) {
        if (endTime <= 0)
            this.endTime = 24;
        else
            this.endTime = endTime;
    }

    public void Start() {
        this.startTime = System.currentTimeMillis();
        System.out.println("Time Begin accessing the algorithm selection sort is: "+this.startTime);
    }

    public void End() {
       this.endTime = System.currentTimeMillis();
       System.out.println("Time Ending accessing the algorithm selection sort is: "+this.endTime);
    }

    public double getElapsedTime() {
        return (this.endTime - this.startTime);
    }

    public static void main(String[] args) {
        int[] array = new int[100000];
        StopWatch watch = new StopWatch();
        watch.Start();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp;
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        watch.End();
        System.out.println("Time accessing the algorithm selection sort with 100000 number is : "+watch.getElapsedTime());
    }
}
