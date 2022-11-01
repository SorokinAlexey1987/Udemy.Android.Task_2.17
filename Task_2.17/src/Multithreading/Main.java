package Multithreading;

public class Main {
    public static void main(String[] args) {
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i = 0; i < 10; i++){
                        System.out.println(1);
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {

                }
            }
        });
        timer.start();
        Thread timer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i = 0; i < 10; i++){
                        System.out.println(2);
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {

                }
            }
        });
        timer2.start();
    }
}
