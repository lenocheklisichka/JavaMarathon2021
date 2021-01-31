package day11.task2;

import day11.task2.interfaces.MagicAttack;

public class Magician extends Hero implements MagicAttack {
    int magicAtt = 20;

    public Magician() {
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
    }

    public void magicalAttack(Hero hero) {
        double attackMagnitude = magicAtt * ( 1 - hero.magicDef );
        if (hero.health - attackMagnitude < 0) {
            hero.health = 0;
        } else {
            hero.health -= attackMagnitude;
        }
    }

    public String toString() {
        return "Magician {" + "health = " + health + "}";
    }
}
