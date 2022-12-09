package fourhomework.Figure;

public class main {
    protected int a;
    public static void main(String[] args) {
        figure[] figr = new figure[]{
                new Circle(20),
                new Triangle(10, 15),
                new Square(30)
        };
        for (figure figure: figr) {
            figure.countArea(13);
            figure.countAreaTriangle(11,15);
        }


    }
}
