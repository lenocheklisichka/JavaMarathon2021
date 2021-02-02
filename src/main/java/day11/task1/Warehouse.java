package day11.task1;

public class Warehouse {
    private int countDeliveredOrders;
    private int countPickerOrders;

    public int getCountPickedOrders(){
        return countPickerOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public void setCountPickerOrders(int countPickerOrders) {
        this.countPickerOrders = countPickerOrders;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countDeliveredOrders=" + countDeliveredOrders +
                ", countPickerOrders=" + countPickerOrders +
                '}';
    }
}
