package threeHomework;

public class Dog extends Animals {
    private final int maxDistance = 300;

    private final int isSwimm = 10;
    private static int dogCount;


    public Dog() {
        super.maxDistance = this.maxDistance;
        super.isSwim = this.isSwimm;
        incrementDog();
        
    }
    public static void incrementDog(){
        dogCount++;
    }
    public static int getDogCount(){
        return dogCount;
    }



}
