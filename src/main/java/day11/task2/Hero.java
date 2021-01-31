package day11.task2;

import day11.task2.interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {
    int health;
    double physDef;
    double magicDef;
    double physAtt;
    double magicAtt;

    public Hero() {
        health = 100;
    }

    public void physicalAttack(Hero hero) {
        double attackMagnitude = physAtt * ( 1 - hero.physDef );
        if (hero.health - attackMagnitude < 0) {
            hero.health = 0;
        } else {
            hero.health -= attackMagnitude;
        }
    }
}
