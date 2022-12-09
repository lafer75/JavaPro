package fourhomework.Figure;

public class Square implements figure{

    int way;

    public Square(int way) {
        this.way = way;
    }

    @Override
    public void countArea(int area) {
        int a = area;
        int b = a*4;
        if( area <= way){
            System.out.println("Площа квадрата: " + b + " cm");
        }else {
            System.out.println("Щось пішло нет, змініть числа або спробуйте пізніше");
        }

    }

    @Override
    public void countAreaTriangle(int triangll, int triangles) {

    }
}
