package fourhomework.Figure;

public class Triangle implements Figure {

    int thetop;


    public Triangle( int thetop) {
        this.thetop = thetop;

    }





    @Override
    public void countArea(int area) {
        int a = area;
        double c = a*3;
        if (a <= thetop && a>0) {
            System.out.println("Площа трикутника: " + c + " cm");
        }else{
            System.out.println("Щось пішло нет, змініть числа або спробуйте пізніше");
        }
    }
}
