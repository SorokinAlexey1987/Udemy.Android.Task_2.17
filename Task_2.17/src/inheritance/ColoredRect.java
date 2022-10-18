package inheritance;

public final class ColoredRect extends Rectangle {
    protected String color;
    public ColoredRect(double a, double b, String color) {
        super(a, b);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void showColor() {
        System.out.println(color);
    }
}
