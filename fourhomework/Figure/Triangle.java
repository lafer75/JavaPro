package fourhomework.Figure;

public class Triangle implements figure {

    int thetop;
    int side;

    public Triangle(int side, int thetop) {
        this.thetop = thetop;
        this.side = side;
    }



    @Override
    public void countAreaTriangle(int triangll, int triangles) {
        int a = triangll;
        int b = triangles;
        double c = (a*b)/2;
        if (b <= thetop && a >= side) {
            System.out.println("Площа трикутника: " + c + " cm");
        }else{
            System.out.println("Щось пішло нет, змініть числа або спробуйте пізніше");
        }

    }
    @Override
    public void countArea(int area) {
    }
}
