package fourhomework.Member;

public class Wall extends Obstacle {
    public Wall(double height) {
        super(height, 0, "Wall");
    }

    @Override
    public void overcome(Practicant practicant) {
        if (practicant.getMaxJump() > height) {
            practicant.jump();
        } else {
            practicant.setObstracteCounter();
            System.out.println(practicant.getName() + "cannot jump");
        }
    }


}
