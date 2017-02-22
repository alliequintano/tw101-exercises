package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by alexandraquintano on 2/22/17.
 */
public class Orc implements Monster {
    int hitpoints = 20;
    String name = "Orc";

    @Override
    public void takeDamage(int amount) {
        hitpoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + " " + hitpoints);
    }
}
