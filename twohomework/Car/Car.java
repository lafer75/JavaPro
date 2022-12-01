package twohomework.Car;

public class Car implements Intarfacecar {
    static Car engine = new Car();

    @Override
    public void startElectricity() {
        System.out.println("Вімкнувся акумолятор");
    }

    @Override
    public void startCommand() {
        System.out.println("Наказав увімкунти електрику та подачу палива");
    }

    @Override
    public void startFuelSystem() {
        System.out.println("Запустилась подача топлива");
    }

    static void start(Intarfacecar start){
        start.startCommand();
        start.startElectricity();
        start.startFuelSystem();
    };

    public static void main(String[] args) {
        start(engine);
    }



}
