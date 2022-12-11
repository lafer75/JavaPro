package fivehomework;

public class HomeWorkApp {
    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    static void checkSumSign() {
        int a = 1;
        int b = -4;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сума позитивна " + c);
        } else {
            System.out.println("Сума негативна " + c);
        }
    }

    static void printColor() {
        int value = 56;
        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value >= 1 && value <= 100) {
            System.out.println("Жовтий");
        } else if (value >= 100) {
            System.out.println("Зелений");
        }

    }

    static void compareNumbers() {
        int a = 3;
        int b = 3;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }



    static void sixQuestion(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
    static void sevenQuestion(int a) {
        if(a>=0){
            System.out.println("Додатнє число");
        }else{
            System.out.println("Відємне число");
        }
    }
    static void eightQuestion(int a) {
        if(a>=0){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
    }

    public static void main(String[] args) {
        HomeWorkApp.printThreeWords();
        System.out.println("----------------------------------");
        HomeWorkApp.checkSumSign();
        System.out.println("----------------------------------");
        HomeWorkApp.printColor();
        System.out.println("----------------------------------");
        HomeWorkApp.compareNumbers();
        System.out.println("----------------------------------");
        HomeWorkApp.sixQuestion(12,2);
        System.out.println("----------------------------------");
        HomeWorkApp.sevenQuestion(-3);
        System.out.println("----------------------------------");
        HomeWorkApp.eightQuestion(3);
        System.out.println("----------------------------------");
    }
}
