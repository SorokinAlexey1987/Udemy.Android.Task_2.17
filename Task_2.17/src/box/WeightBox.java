package box;

public class WeightBox extends Box {
    private double weight;

    public WeightBox(double lenght, double wigth, double height, double weight) {
        super(lenght, wigth, height);
        this.weight = weight;
    }

    public WeightBox(double size) {
        super(size);
        this.weight = size;
    }

    public WeightBox() {
        this(5);
        this.weight = 5;
    }

    public WeightBox(Box another, double weight) {
        super(another);
        this.weight = weight;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("weight = " + this.weight);
    }
}
