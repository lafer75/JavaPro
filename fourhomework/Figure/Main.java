package fourhomework.Figure;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {
    protected int a;
    public static void main(String[] args) {
        Figure[] figr = new Figure[]{
                new Circle(14),
                new Triangle(15,14,19),
                new Square(7)
        };
        for (Figure figure: figr) {

        }
        NumberFormat nf = new DecimalFormat("#.##");
        System.out.println("Загальна площа: " + nf.format(Main.summary(figr)));


    }
    public static double summary(Figure[] figures){
        double result = 0.0;
        for (Figure figure: figures) {
            System.out.println("Нова площа: " + (figure.getArea()));
            result += figure.getArea();
        }
         return result;
    }
}
