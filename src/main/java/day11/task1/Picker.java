package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private final Warehouse warehouse;
    private int countPickedOrders;

    public int getSalary() {
        return salary;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.countPickerOrders++;
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() <= 10000) {
            System.out.println("Бонус пока не доступен");
        }
        else if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        }
        salary += 70000;
    }

    public String toString() {
        return "Количество собранных заказов на складе "
                + warehouse.getCountPickedOrders()
                + ", " + "ЗП сборщика " + getSalary();
    }
}
