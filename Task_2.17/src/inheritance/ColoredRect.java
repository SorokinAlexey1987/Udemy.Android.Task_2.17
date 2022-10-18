package inheritance;

public class ColoredRect extends Rectangle {
    protected String color;
    public ColoredRect(double a, double b, String color) {
        super(a, b);
        this.color = color;
    }

    @Override
    public void showPerimetr() {
        super.showPerimetr();
    }

    public void showColor() {
        System.out.println(color);
    }
}
