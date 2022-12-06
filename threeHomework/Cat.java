package threeHomework;

public class Cat extends Animals {
    private final int maxDistance = 200;
    private static int catCount;

    public Cat() {
        super.maxDistance = this.maxDistance;
        incrementCat();
    }

    public Cat(boolean isSwim) {
        super.maxDistance = this.maxDistance;
    }
    public static void incrementCat(){
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }


}
