package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private final Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (warehouse.getCountDeliveredOrders() == 10000) {
            salary += 50000;
            isPayed = true;
        }

        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        }
    }

    public String toString() {
        return "Количество доставленных заказов на складе "
                + warehouse.getCountDeliveredOrders()
                + "," + " ЗП курьера " + getSalary();
    }
}
