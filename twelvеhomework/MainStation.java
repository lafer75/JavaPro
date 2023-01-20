package twelvеhomework;

public class MainStation {
    public static void main(String[] args) {
        PetrolStation petrolStation = new PetrolStation(50);
        petrolStation.doRefuel(10);
        petrolStation.doRefuel(3);
        petrolStation.doRefuel(10);
        petrolStation.doRefuel(28);
    }
}
