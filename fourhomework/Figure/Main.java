package fourhomework.Figure;

public class Main {
    protected int a;
    public static void main(String[] args) {
        Figure[] figr = new Figure[]{
                new Circle(20),
                new Triangle(15),
                new Square(30)
        };
        for (Figure figure: figr) {
            figure.countArea(13);
        }


    }
}
