package coffee.order;

import static coffee.order.CoffeeOrderBoard.printOrder;

public class Main {
    public static void main(String[] args) {
        coffee.order.CoffeeOrderBoard orderBoard = new coffee.order.CoffeeOrderBoard();
        orderBoard.add("Tea");
        orderBoard.add("Juice");
        orderBoard.add("Americano");

        System.out.println("Список замовлень : ");
        printOrder(orderBoard);
        System.out.println("\n");

        System.out.println("Видалення першого замовлення із списку : ");
        System.out.println(orderBoard.deliver()+"\n");

        System.out.println("Список замовлень : ");
        printOrder(orderBoard);
        System.out.println("\n");

        System.out.println("Нові замовлення в orderList : ");
        orderBoard.add("Cappuccino");
        orderBoard.add("Latte\n");

        System.out.println("Список замовлень : ");
        printOrder(orderBoard);
        System.out.println("\n");

        System.out.println("Видалення замовлення : ");
        System.out.println((orderBoard.deliver(2)));
        System.out.println((orderBoard.deliver(8))+"\n");

        System.out.println("Список замовлень : ");
        printOrder(orderBoard);
        System.out.println("\n");

        System.out.println("Оформелння orderList : ");
        orderBoard.draw();

    }

}
