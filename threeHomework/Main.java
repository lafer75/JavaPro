package threeHomework;

public class Main {
    public static void main(String[] args) {
        Cat tom = new Cat();
        Cat barsik = new Cat();
        Cat jek = new Cat();

        Dog sharik = new Dog();
        Dog jery = new Dog();
        Dog rich = new Dog();

        System.out.println("Animals: \n" + Animals.getAnimalCount());
        System.out.println("Dogs: \n" + Dog.getDogCount());
        System.out.println("Cat: \n" + Cat.getCatCount());

        System.out.println("-----------------------------------------------");
        System.out.println("Побіг кіт:");
        tom.run(130);
        barsik.run(215);
        System.out.println("----------------------");
        System.out.println("Проплив кіт:");
        tom.swim(24);
        jek.swim(3);
        System.out.println("-----------------------------------------------");

        System.out.println("Побіг собака:");
        sharik.run(250);
        rich.run(450);
        System.out.println("----------------------");
        System.out.println("Пропливла собака:");
        rich.swim(11);
        jery.swim(7);

    }

}
