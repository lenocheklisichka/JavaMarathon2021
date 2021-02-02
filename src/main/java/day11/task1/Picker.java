package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private final Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountPickerOrders(warehouse.getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (warehouse.getCountPickedOrders() == 10000) {
            salary += 70000;
            isPayed = true;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        }
    }

    public String toString() {
        return "Количество собранных заказов на складе "
                + warehouse.getCountPickedOrders()
                + ", " + "ЗП сборщика " + getSalary();
    }
}
