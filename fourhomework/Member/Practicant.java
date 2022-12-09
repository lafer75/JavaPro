package fourhomework.Member;

public  class Practicant {


    private String name;
    private double maxJump;
    private double maxRun;
    private  int obstracteCounter;

    public Practicant(final String name, final double maxJump, final double maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public void jump(){
        obstracteCounter++;
        System.out.println("Our particicant" + name + " jumpes");
    }

    public void run(){
        obstracteCounter++;
        System.out.println("Our particicant" + name + " run");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(double maxJump) {
        this.maxJump = maxJump;
    }

    public double getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(double maxRun) {
        this.maxRun = maxRun;
    }

    public int getObstracteCounter() {
        return obstracteCounter;
    }

    public void setObstracteCounter() {
        this.obstracteCounter = 0;
    }
}
