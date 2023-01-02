package fundamental.generics;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {

    private String sound;
    private String eat;

    public Cat() {
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }
}
