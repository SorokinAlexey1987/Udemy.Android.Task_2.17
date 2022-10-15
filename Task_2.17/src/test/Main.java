package test;
import example.MyMath;
import example.Person;
import inheritance.Cat;
import inheritance.Lion;

/**
 * @author Sorokin Aleksei on $DATE
 **/
public class Main {
    public static void main(String... args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println(cat.canEatPerson);
        System.out.println(lion.canEatPerson);

        /*
        example.Test test = new example.Test();
        System.out.println(test.square(5));
        box.Box box = new box.Box(5,4,3);
        box.Box box2 =  new box.Box();
        box.ShowBox();
        box2.ShowBox();

        example.Monster monster = new example.Monster(5);
        monster.voice(3, "Hello!");

        box.Box current = new box.Box(10);
        box.Box another = current.increase();
        System.out.println(current.getVolume());
        System.out.println(another.getVolume());
        System.out.println(current.compare(another));

        current.ShowVolume();
        another.ShowVolume();

        Person person = new Person("John", 25);
        person.setAge(40);
        System.out.println("Name: " + person.getName() + "\r\nAge: " + person.getAge());

        System.out.println(MyMath.length(10));
        System.out.println(MyMath.area(10));
        System.out.println(MyMath.length(10));
        System.out.println(MyMath.sum(1,2,3));
        */
    }
}