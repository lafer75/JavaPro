package threeHomework;

public class Animals {
    private static int animalCount;
    protected int maxDistance;
    protected int isSwim;

    protected  int  isSwimm;

public Animals() {
    incrementAnimalCount();
}

    void run(int distance) {
        if (distance > 0 && distance <=maxDistance){
            System.out.println("RUUUUUUUUUUNNNNN");
        }else {
            System.out.println("pleas again later");
        }
    }

    void swim (int distance){
        if((distance > 0 && distance <=isSwim))
            System.out.println("Супер!!! Він плаває");
            else{
                System.out.println("Не зміг проплисти");

            }
        }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void incrementAnimalCount() {

        this.animalCount++;
    }
}
