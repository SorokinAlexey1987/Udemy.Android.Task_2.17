package example;

/**
 * @author Sorokin Aleksei on 25.09.2022
 **/
public class Monster {
    int eyes;
    int arms;
    int legs;

    public Monster(int eyes, int arms, int legs) {
        this.eyes = eyes;
        this.arms = arms;
        this.legs = legs;
    }

    public Monster(int count) {
        this(count, count, count);
    }

    Monster() {
        this(2);
    }

    void voice() {
        System.out.println("Grrrrr...");
    }

    void voice(int count) {
        for(int i = 0; i < count; i++) {
            System.out.println("Grrrrr...");
        }
    }

    public void voice(int count, String word) {
        for(int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}
