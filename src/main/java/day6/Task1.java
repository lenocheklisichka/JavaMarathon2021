package day6;

class Task1 {
    public static void main(String[] args) {
        Car skoda = new Car();
        skoda.setYear(2020);
        skoda.setColor("White ");
        skoda.setModel("Octavia ");
        skoda.info();
        System.out.println("Skoda"
                + "\nГод выпуска: " + skoda.getYearOfIssue()
                + "\nЦвет: " + skoda.getColor()
                + "\nМодель: " + skoda.getModel());
        int year = skoda.yearDifference(2015);
        System.out.println(year);

        System.out.println();

        Motorbike kawasaki = new Motorbike(2019, "Black", "Performance Sport");
        kawasaki.info();
        System.out.println("KAWASAKI"
                + "\nГод выпуска: " + kawasaki.getYearOfIssue()
                + "\nЦвет: " + kawasaki.getColor()
                + "\nМодель: " + kawasaki.getModel());
    }
}