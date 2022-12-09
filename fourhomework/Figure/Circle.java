package fourhomework.Figure;

public class Circle implements figure {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void countArea(int area) {
        int a = area;
        int b = a/2;
        double c = Math.PI*(b*b);
        double scale = Math.pow(10, 1);
        double result = Math.ceil(c * scale) / scale;
        if( area <= radius){
            System.out.println("Площа кола: " + result + " cm");
        }else {
            System.out.println("Щось пішло нет, змініть числа або спробуйте пізніше");
        }

    }

    @Override
    public void countAreaTriangle(int triangll, int triangles) {

    }

}
