package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Андреев Кирилл", 49));
        members1.add(new MusicArtist("Гейл Маккормик", 80));
        members1.add(new MusicArtist("Джо Хаммер", 70));
        members1.add(new MusicArtist("Вячеслав Бутусов", 59));
        MusicBand band1 = new MusicBand("Nautilus Pompilius", 1980, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Томас Андерс", 57));
        members2.add(new MusicArtist("Красовицкий Александр ", 48));
        members2.add(new MusicArtist("Ибадин Наталья ", 41));
        members2.add(new MusicArtist("Джеймс Лавель", 46));
        members2.add(new MusicArtist("Бен Спивак", 38));
        members2.add(new MusicArtist("Михаель Крету", 63));
        MusicBand band2 = new MusicBand("Enigma", 1990, members2);

        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();

    }
}
