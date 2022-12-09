package fourhomework.Figure;

public class Square implements Figure {

    int way;

    public Square(int way) {
        this.way = way;
    }

    @Override
    public void countArea(int area) {
        int a = area;
        int b = a*4;
        if( area <= way && a>0){
            System.out.println("Площа квадрата: " + b + " cm");
        }else {
            System.out.println("Щось пішло нет, змініть числа або спробуйте пізніше");
        }

    }
}
