package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("участник1");
        members1.add("участник2");
        members1.add("участник3");
        members1.add("участник4");
        MusicBand band1 = new MusicBand("Nautilus Pompilius", 1980, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("участник5");
        members2.add("участник6");
        members2.add("участник7");
        members2.add("участник8");
        members2.add("участник9");
        members2.add("участник10");
        MusicBand band2 = new MusicBand("Enigma", 1990, members2);

        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
    }
}
