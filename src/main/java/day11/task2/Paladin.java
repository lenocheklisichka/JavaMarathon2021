package day11.task2;

import day11.task2.interfaces.Healer;

public class Paladin extends Hero implements Healer {
    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if (health + 25 > 100) {
            health = 100;
        } else {
            health += 25;
        }
    }

    public void healTeammate(Hero hero) {
        if (hero.health + 10 > 100) {
            hero.health = 100;
        } else {
            hero.health += 10;
        }
    }

    public String toString() {
        return "Paladin {" + "health = " + health + "}";
    }
}
