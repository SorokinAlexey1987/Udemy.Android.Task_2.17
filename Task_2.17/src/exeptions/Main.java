
package exeptions;

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
        /*
        catch(NumberFormatException n) {
            System.out.println("Format error!");
        }
        */
    }
}
