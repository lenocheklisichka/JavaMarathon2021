package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand A, MusicBand B) {
//        for (String member : B.getMembers()) {
//            A.getMembers().add(member);
//        }
        B.getMembers().addAll(A.getMembers());
        A.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(members);
    }

    public String toString() {
        return "Музыкальная группа " + getName() + "," + " год выпуска " + getYear() + "\n";
    }

}
