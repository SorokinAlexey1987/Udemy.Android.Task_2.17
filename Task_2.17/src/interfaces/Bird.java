package interfaces;

public class Bird extends Animal implements AbleToFly, AbleToRun {
    @Override
    public void eat() {
        System.out.println("bird eat");
    }

    @Override
    public void Fly() {
        System.out.println("bird eat");
    }

    @Override
    public void run() {
        System.out.println("bird run");
    }
}
