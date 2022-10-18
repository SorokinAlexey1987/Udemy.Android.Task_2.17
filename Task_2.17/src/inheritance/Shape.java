package inheritance;

public class Shape {
    protected double a;
    protected double b;

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getPerimetr() {
        return (this.a + this.b);
    }

    public void showPerimetr() {
        System.out.println(getPerimetr());
    }
}
