package day12.task5;

public class MusicArtist {
    private String name;
    private int age;

    public MusicArtist(String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Музыкальный исполнитель " + getName() + ", " + "возраст " + getAge() + "\n";
    }
}
