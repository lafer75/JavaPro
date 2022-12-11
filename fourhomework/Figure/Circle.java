package fourhomework.Figure;

public class Circle implements Figure {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return (radius*3.14)*2;
    }
}



