package Multithreading;

import org.w3c.dom.ls.LSOutput;

public class Main {
    static boolean isFive = false;

    public static void main(String[] args) {
        int j = (int)(Math.random() * 10);
        System.out.println(j);

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while(true) {
                        if (i == 5) {
                            isFive = true;
                        }
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {

                }
            }
        });
        timer.start();
    }

}
