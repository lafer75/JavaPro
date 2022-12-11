package fourhomework.Figure;

public class Triangle implements Figure {

    int downSide;
    int leftSide;
    int rightSide;

    public Triangle(int downSide, int leftSide, int rightSide) {
        this.downSide = downSide;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    @Override
    public double getArea() {
        return (downSide+leftSide+rightSide)/2;
    }
}

