package interfaces;

public class WaiterBob implements Waiter{
    @Override
    public void bringOrder(String dish) {
        System.out.println("I am bring you: " + dish);
    }
}
