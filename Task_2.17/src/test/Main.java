package test;

import box.Box;
import box.WeightBox;
import inheritance.ColoredRect;
import inheritance.Rectangle;
import inheritance.Shape;
import inheritance.Triangle;

/**
 * @author Sorokin Aleksei on $DATE
 **/
public class Main {
    public static void main(String... args) {
        double random = Math.random();
        random *=6;
        int randomInt = (int)random;
        randomInt++;
        System.out.println(randomInt);
        /*
        Rectangle rect = new Rectangle(10, 10);
        Triangle triangle = new Triangle(10, 10, 10);
        ColoredRect colorrect = new ColoredRect(5, 5, "red");
        rect.showPerimetr();
        triangle.showPerimetr();
        colorrect.showColor();

        Box box = new Box(10);
        WeightBox weightBox = new WeightBox(10, 20, 30, 15.5);
        box.showInfo();
        weightBox.showInfo();

        System.out.println(box);

        Empty empty = new Empty();
        System.out.println(empty.toString());

        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println(cat.isCanEatPerson());
        System.out.println(lion.isCanEatPerson());
        cat.eat();
        lion.eat();

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