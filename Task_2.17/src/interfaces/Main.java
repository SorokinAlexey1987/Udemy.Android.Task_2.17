package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        WaiterBob waiterBob = new WaiterBob();
        client.makeOrder(waiterBob, "meat");
        client.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("I am bring you: " + dish);
            }
        }, "soup");
        /*
        Director director = new Director();
        Programmer programmer = new Programmer();
        director.force(programmer);
        director.force(new Worker() {
            @Override
            public void work() {
                System.out.println("work");
            }
        });
        */

        /*
        Director director = new Director();
        Programmer programmer = new Programmer();
        Chef chef = new Chef();

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(director);
        workers.add(programmer);
        workers.add(chef);
        for (Worker worker: workers) {
            worker.work();
        }

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(programmer);
        drivers.add(chef);
        for (Driver driver: drivers) {
            driver.drive();
        }
        */

        /*
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();

        ArrayList<AbleToRun> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        for (AbleToRun animal : animals) {
            animal.run();
        }
        AbleToFly ableToFly = new Bird();
        ableToFly.Fly();

        AbleToRun ableToRun = new Dog();
        Dog mydog = (Dog) ableToRun;
        */

        /*
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        animals.add(fish);
        for (Animal animal: animals) {
            animal.eat();
        }
        Animal animal = new Cat();
        animal.eat();
        Dog dog2 = (Dog) animal;
        dog2.run();
        */
    }
}
