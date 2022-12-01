package twohomework.Human;

public class Employee implements Human {


    @Override
    public void PIB() {
        System.out.println("Шиш Андрій Андрійович");
    }

    @Override
    public void position() {
        System.out.println("Програміст");
    }

    @Override
    public void years() {
        System.out.println("15 років");
    }
}
