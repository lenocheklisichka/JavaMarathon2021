package day8;

public class Airplane {
    private final String producer;
    private final int year;
    private final int length;
    private final int weight;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public String toString() {
        return "Изготовитель: " + producer + "," + " "
                + "год выпуска: " + year + "," + " "
                + "длина: " + length + "," + " "
                + "вес: " + weight;
    }
}
