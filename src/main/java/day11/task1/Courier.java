package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private final Warehouse warehouse;
    private int countDeliveredOrders;

    public int getSalary() {
        return salary;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.countDeliveredOrders++;
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() <= 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        }
        salary += 50000;
    }

    public String toString() {
        return "Количество доставленных заказов на складе "
                + warehouse.getCountDeliveredOrders()
                + "," + " ЗП курьера " + getSalary();
    }
}
