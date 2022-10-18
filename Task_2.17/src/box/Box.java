package box;

/**
 * @author Sorokin Aleksei on 25.09.2022
 **/
public class Box {
    protected double lenght;
    protected double wigth;
    protected double height;

    public double getLenght() {
        return lenght;
    }

    public double getWigth() {
        return wigth;
    }

    public double getHeight() {
        return height;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWigth(double wigth) {
        this.wigth = wigth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Box(double lenght, double wigth, double height) {
        this.lenght = lenght;
        this.wigth = wigth;
        this.height = height;
    }

    public Box(double size) {
        this(size, size, size);
    }

    public Box() {
        this(5);
    }

    Box(Box another) {
        this(another.lenght, another.wigth, another.height);
    }

    public void ShowBox() {
        System.out.println("lenght = " + this.lenght + ", wigth = " + this.wigth + ", height = " + this.height);
    }

    public void ShowVolume() {
        System.out.println("Volume = " + this.lenght * this.wigth * this.height);
    }

    private double getVolume() {
        return lenght * wigth * height;
    }

    Box copy() {
        return new Box(this.lenght, this.wigth, this.height);
    }

    public Box increase() {
        return new Box(this.lenght * 2, this.wigth * 2, this.height * 2);
    }

    public int compare(Box another) {
        double currentVolume = this.getVolume();
        double anotherVolume = another.getVolume();
        int result;
        if (currentVolume > anotherVolume) {
            result = 1; //System.out.println("Current > Another");
        } else if (currentVolume < anotherVolume) {
            result = -1; //System.out.println("Current < Another");
        } else {
            result = 0; //System.out.println("Current = Another");
        }
        return result;
    }

    public void showInfo() {
        System.out.println("lenght = " + this.lenght + ", wigth = " + this.wigth + ", height = " + this.height);
    }
}
