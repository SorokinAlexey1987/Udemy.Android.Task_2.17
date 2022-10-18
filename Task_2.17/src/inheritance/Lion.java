package inheritance;

public class Lion extends CatFamily {
    public Lion() {
        super(4,2,true);
        legs = 5;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Antilop");
    }
}
