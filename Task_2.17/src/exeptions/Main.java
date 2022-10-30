
package exeptions;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b;
        try {
            b = 7 / a;
            System.out.println("b = " + b);
            int c = Integer.parseInt("sgfgfge");
        } catch(ArithmeticException e) {
            System.out.println("Деление на ноль!!");
        } catch(Exception e) {
            System.out.println("Поймано исключение " + e.getClass());
        }

        int[] numbers = new int[10];
        for (int i = 0; i< numbers.length; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
        System.out.println(numbers[10]);


        /*
        catch(NumberFormatException n) {
            System.out.println("Format error!");
        }
        */
    }
}
