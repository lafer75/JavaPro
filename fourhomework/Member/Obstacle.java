package fourhomework.Member;

public abstract class Obstacle {
    double height;
    double length;
    String name;

    public Obstacle(final double height, final double length, final String name) {
        this.height = height;
        this.length = length;
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public abstract void overcome(Practicant practicant);
}
