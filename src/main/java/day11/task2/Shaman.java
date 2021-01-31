package day11.task2;

import day11.task2.interfaces.Healer;
import day11.task2.interfaces.MagicAttack;

public class Shaman extends Hero implements MagicAttack, Healer {
    int magicAtt = 15;

    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
    }

    @Override
    public void healHimself() {
        if (health + 50 > 100) {
            health = 100;
        } else {
            health += 30;
        }

    }

    public void healTeammate(Hero hero) {
        if (hero.health + 30 > 100) {
            hero.health = 100;
        } else {
            hero.health += 30;
        }

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
        return "Shaman {" + "health = " + health + "}";
    }
}
