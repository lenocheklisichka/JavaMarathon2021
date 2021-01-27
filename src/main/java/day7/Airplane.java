package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public static void compareAirplanes(Airplane plane1, Airplane plane2) {
        if (plane1.length > plane2.length) {
            System.out.println("Самолет " + plane1.producer + " больше чем самолет " + plane2.producer);
        } else if (plane1.length < plane2.length) {
            System.out.println("Самолет " + plane1.producer + " меньше чем самолет " + plane2.producer);
        } else {
            System.out.println("Длина самолета " + plane1.producer + " равна длине самолета " + plane2.producer);
        }
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + "," + " "
                + "год выпуска: " + year + "," + " "
                + "длина: " + length + "," + " "
                + "вес: " + weight + "," + " "
                + "количество топлива в баке: " + fuel);
    }

    public void fillUp(int n) {
        this.fuel = n + getFuel();
    }
}
