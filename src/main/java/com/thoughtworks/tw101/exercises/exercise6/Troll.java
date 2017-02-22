package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by alexandraquintano on 2/22/17.
 */
public class Troll implements Monster {
    int hitpoints = 40;
    String name = "Troll";

    @Override
    public void takeDamage(int amount) {
        hitpoints -= amount/2;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + " " + hitpoints);
    }
}
