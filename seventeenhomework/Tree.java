package seventeenhomework;

public class Tree {
        private Node tree;

        public Node getTree() {
            return tree;
        }

        public void addNode(int value) {
            tree = addNode(tree, value);
        }

        private Node addNode(Node num, int value) {
            if (num == null) {
                return new Node(value);
            }
            if (value < num.getValue()) {
                num.setLeft(addNode(num.getLeft(), value));
            } else if (value > num.getValue()) {
                num.setRight(addNode(num.getRight(), value));
            } else {
                return num;
            }
            return num;
        }

        public void printNode(){
            Node node = this.getTree();
            printNodeRightLeft(node);
        }

        private void printNodeRightLeft(Node num) {
            if (num != null) {
                printNodeRightLeft(num.getLeft());
                System.out.print(num.getValue() + " ");
                printNodeRightLeft(num.getRight());
            }
        }


}
