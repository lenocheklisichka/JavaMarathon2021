package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        businessProcess(picker);
        System.out.println(picker);

        businessProcess(courier);
        System.out.println(courier);

        picker2.doWork();
        courier2.doWork();
    }

    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

    public static void businessProcess(Picker picker) {
        for (int i = 0; i <= 9998; i++) {
            picker.doWork();
        }
        picker.bonus();
    }

    public static void businessProcess(Courier courier) {
        for (int i = 0; i <= 9999; i++) {
            courier.doWork();
        }
        courier.bonus();
    }
}
