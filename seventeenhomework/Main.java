package seventeenhomework;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        for (int i = 0; i < 10; i++) {
            tree.addNode((int) (Math.random()*100));
        }
        tree.printNode();

    }
}
