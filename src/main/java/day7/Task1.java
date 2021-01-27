package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2020, 30077, 4000);
        airplane.setFuel(5);
        airplane.setProducer("Boeing");
        airplane.setYear(2020);
        airplane.setLength(30077);
        airplane.setWeight(40000);
        airplane.fillUp(1000);
        airplane.fillUp(4000);
        airplane.info();

        Airplane airplane2 = new Airplane("Sukhoi", 2020, 20023, 4000);
        Airplane.compareAirplanes(airplane, airplane2);
    }
}