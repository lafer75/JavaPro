package fourhomework.Member;

public class Rail extends Obstacle {

    public Rail(double length) {
        super(0, length, "Rail");
    }

    @Override
    public void overcome(Practicant practicant) {
        if (practicant.getMaxRun() > length) {
            practicant.run();
        } else {
            practicant.setObstracteCounter();
            System.out.println(practicant.getName() + "cannot run");
        }

    }
}
