package Multithreading;

import org.w3c.dom.ls.LSOutput;

import javax.swing.text.AbstractDocument;

public class Main {
    static boolean win = false;

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100000000);

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while (!win) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {
                }
            }
        });
        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!win) {
                    int number = (int) (Math.random() * 100000000);
                    if (number == randomNumber) {
                        win = true;
                        System.out.println(number);
                    }
                }
            }
        });
        timer.start();
        player.start();
    }
}
