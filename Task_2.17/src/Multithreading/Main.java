package Multithreading;

public class Main {
    public static void main(String[] args) {
        RunnableTimer runnableTimer = new RunnableTimer();
        Thread timer = new Thread(runnableTimer);
        timer.start();
        for(int i = 0; i < 1000000; i++) {
            System.out.println(2);
        }
    }
}
