package fourhomework.Figure;

public class Square implements Figure {

    int way;

    public Square(int way) {
        this.way = way;
    }


    @Override
    public double getArea() {
        return way *4;

    }
}
