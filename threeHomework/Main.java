package threeHomework;

public class Main extends Cat {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        Cat sharik = new Cat();
        Dog tusia = new Dog();
        Dog bobik = new Dog();
        barsik(barsik);
        sharik(sharik);
        tusia(tusia);
        bobik(bobik);


    }
    static int check = 0;

    public static void barsik(Cat barsik) {
        int a = barsik.run(150);
        System.out.println("Кіт Барсик пробіг " + a + " м");
        barsik.swim();
        System.out.println("-----------------------------------------");
        check ++;
    }

    public static void sharik(Cat sharik) {
        int a = sharik.run(75);
        System.out.println("Кіт Шарік пробіг " + a + " м");
        sharik.swim();
        System.out.println("-----------------------------------------");
        check ++;
    }

    public static void tusia(Dog tusia) {
        int a = tusia.run(287);
        System.out.println("Собака Тузя пробіг " + a + " м");
        int b = tusia.swim(6);
        System.out.println("Собака Тузя проплив " + b + " м");
        System.out.println("-----------------------------------------");
        check ++;
    }

    public static void bobik(Dog bobik) {
        int a = bobik.run(347);
        System.out.println("Собака Шарік пробіг " + a + " м");
        int b = bobik.swim(4);
        System.out.println("Собака Шарік проплив " + b + " м");
        System.out.println("-----------------------------------------");
        check ++;
        System.out.println("Було їх " + check +"-ро");
    }




}
