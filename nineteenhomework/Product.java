package nineteenhomework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Product {
    private String typeProduct;
    private double value;
    private boolean found;
    private String date;

    public Product(String typeProduct, double value) {
        this.typeProduct = typeProduct;
        this.value = value;
    }

    public Product(String typeProduct, double value, boolean found) {
        this.typeProduct = typeProduct;
        this.value = value;
        this.found = found;
    }

    public boolean isFound() {
        return found;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public double getValue() {
        return value;
    }

    public static int comparePrice(Product p1, Product p2) {
        if (p1.getValue() > p2.getValue()) {
            return 1;
        }
        return -1;
    }

    public static String setDate() {
        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd hh:mm:ss");
        String a = localDate.format(formatter);
        return a;
    }
}
