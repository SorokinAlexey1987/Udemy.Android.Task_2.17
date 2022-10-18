package inheritance;

public abstract class Shape {
    protected double a;
    protected double b;

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public final double getA() {
        return a;
    }

    public final double getB() {
        return b;
    }

    public abstract double getPerimetr();

    public final void showPerimetr() {
        System.out.println(getPerimetr());
    }
}
