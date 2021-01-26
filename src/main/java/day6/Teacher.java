package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSubject(String subject) {
        this.subject= subject;
    }
    public String getSubject() {
        return subject;
    }
    public void evaluate(Student student) {
        Random rand = new Random();
        int randValue = rand.nextInt(4) +2;

        String evaluation = "";
        switch (randValue) {
            case 2 : evaluation = "неудовлетворительно";
            break;
            case 3 : evaluation = "удовлетворительно";
            break;
            case 4 : evaluation = "хорошо";
            break;
            case 5 : evaluation = "отлично";
            break;
        }
        System.out.println("Преподаватель " + getName()
                    +  " оценила студента с именем " + student.getName() +
                   " по предмету " + getSubject() + " на оценку " + evaluation);
    }
}
