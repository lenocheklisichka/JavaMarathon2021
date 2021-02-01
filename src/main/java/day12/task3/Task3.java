package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Иванушки International", 1995);
        MusicBand band2 = new MusicBand("Smith ", 1969);
        MusicBand band3 = new MusicBand("Space", 1977);
        MusicBand band4 = new MusicBand("Nautilus Pompilius", 1980);
        MusicBand band5 = new MusicBand("Modern Talking", 1984);
        MusicBand band6 = new MusicBand("Animal ДжаZ", 2000);
        MusicBand band7 = new MusicBand("Банд’Эрос", 2005);
        MusicBand band8 = new MusicBand("Highway", 2016);
        MusicBand band9 = new MusicBand("Magic", 2012);
        MusicBand band10 = new MusicBand("Enigma", 1990);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);
        System.out.println(musicBands);

        groupsAfter2000(musicBands);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band : musicBands) {
            if (band.getYear() > 2000) {
                groupsAfter2000.add(band);
            }
        }
        System.out.println(groupsAfter2000);
        return groupsAfter2000;
    }
}
