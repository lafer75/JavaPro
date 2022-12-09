package fourhomework.Member;

public class main {
    public static void main(String[] args) {


        Human human = new Human("laf", 13, 18);
        Cat cat = new Cat("catt", 2, 35);
        Wall wall = new Wall(2);
        Rail rail = new Rail(11);
        Obstacle[] obstacles = new Obstacle[]{wall, rail};
        Practicant[] practicants = new Practicant[]{human, cat};

        for (Practicant practicant: practicants) {
            System.out.println("Новий практикант " + practicant.getName());
            for (Obstacle obstacle: obstacles) {
                System.out.println("Нова перешекода " + obstacle.getName());
                obstacle.overcome(practicant);
                if(practicant.getObstracteCounter() == 0){
                    break;
                }
            }
            
        }
    }
}
