package eighteenhomework.box;

public class Main {
    public static void main(String[] args) {
        Box box = new Box<>();
        Box box1 = new Box<>();
        Box box2 = new Box<>();
        Fruit Apple = new Apple();
        Fruit Orange = new Orange();
        Fruit Apple1 = new Apple();
        Fruit Orange1 = new Orange();
        Fruit Apple2 = new Apple();
        Fruit Orange2 = new Orange();


        System.out.println("Apple weigh: " + Apple.getWeight());
        System.out.println("Orange weigh: " + Orange.getWeight());
        System.out.println();

        System.out.println("Box weigh: " + box.getWeight());
        System.out.println();

        box.addOne(Apple);
        box1.addOne(Orange);

        System.out.println("Box weigh: " + box.getWeight());
        System.out.println("Box1 weigh: " + box1.getWeight());
        System.out.println();

        System.out.println(box.toString());
        System.out.println();

        box.addMany(Apple1,Apple2,Orange1);
        System.out.println(box);
        System.out.println("Box style: " + box.getBoxStyle());
        System.out.println();

        box1.addMany(Orange1,Orange2,Apple1,Orange2);
        System.out.println(box1);
        System.out.println("Box style: " + box1.getBoxStyle());
        System.out.println();

        System.out.println("Box weigh: " + box.getWeight());
        System.out.println("Box1 weigh: " + box1.getWeight());
        System.out.println();

        System.out.println("box compare box1");
        System.out.println(box.compare(box1));
        System.out.println();

        System.out.println("box1 compare box");
        System.out.println(box1.compare(box));
        System.out.println();

        System.out.println("box compare box");
        System.out.println(box.compare(box));
        System.out.println();

        box2.addMany(Apple1,Apple2,Apple);
        System.out.println("box: " + box);
        System.out.println("box2: " + box2);
        System.out.println("box merge box2");
        box.merge(box2);
        System.out.println("box: " + box);
        System.out.println("box2: " + box2);
        System.out.println();

        System.out.println("box: " + box);
        System.out.println("box1: " + box1);
        System.out.println("box merge box1");
        box.merge(box1);
        System.out.println("box: " + box);
        System.out.println("box1: " + box1);
        System.out.println();
    }
}
