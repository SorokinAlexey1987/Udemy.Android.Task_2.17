package inheritance;

public abstract class Shape {
    protected double a;
    protected double b;

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double getPerimetr();

    public void showPerimetr() {
        System.out.println(getPerimetr());
    }
}
