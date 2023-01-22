package coffee.order;

import java.util.ArrayDeque;
import java.util.ArrayList;


public class CoffeeOrderBoard {
    public ArrayDeque<coffee.order.Order> orderList;
    private int lastOrderNumber = 0;

    public CoffeeOrderBoard() {
        orderList = new ArrayDeque<>();
    }

    public void add(String a) {
        orderList.addLast(new coffee.order.Order(++lastOrderNumber, a));
    }

    public String deliver() {
        coffee.order.Order o = orderList.pollFirst();
        String result = "Замовлення видалено : " + o.getCustomerName() + ", " + o.getOrderNumber();
        return result;
    }
    public String deliver(int number) {
        coffee.order.Order o = new coffee.order.Order(0, null);
        for (coffee.order.Order order : orderList) {
            if (order.getOrderNumber() == number) {
                o = order;
            }
        }
        String result = "Замовлення видалено : " +  o.getCustomerName() + ", " + o.getOrderNumber();
        if (o.getCustomerName() == null) {
            return "Немає замовляння на номер : " + number + "\n";
        }
        orderList.remove(o);
        return result;
    }
    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (coffee.order.Order o : orderList) {
            System.out.printf("%d| %s\n",o.getOrderNumber(), o.getCustomerName());
        }
    }
    static void printOrder(coffee.order.CoffeeOrderBoard order) {
        for (coffee.order.Order i : order.orderList) {
            System.out.println("№ "+i.getOrderNumber() + " : " + i.getCustomerName());
        }
    }
}


