package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        System.out.println("/-----------------Сотрудники с бонусом------------------------/");
        businessProcess(picker2);
        System.out.println(picker2);
        businessProcess(courier2);
        System.out.println(courier2);

        System.out.println("/=================Сотрудники без бонуса=========================/");
        picker.doWork();
        picker.bonus();
        System.out.println(picker);
        courier.doWork();
        courier.bonus();
        System.out.println(courier);
        System.out.println("/===================================================================/");
    }

    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
