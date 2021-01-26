package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2020, 200, 40000);
        airplane.setFuel(0);
        airplane.setProducer("Boeing");
        airplane.setYear(2020);
        airplane.setLength(35);
        airplane.setWeight(40000);
        airplane.fillUp(1000);
        airplane.fillUp(4000);
        airplane.info();
    }
}
