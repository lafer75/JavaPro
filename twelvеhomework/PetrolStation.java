package twelvеhomework;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class PetrolStation {
    private int amount;
    private final Semaphore semaphore = new Semaphore(3);

    public PetrolStation(int amount) {
        this.amount = amount;
    }

    public void doRefuel(int requestedAmount) {
        try {
            semaphore.acquire();
            int refuelTime = ThreadLocalRandom.current().nextInt(3, 11);
            Thread.sleep(refuelTime * 1000L);
            int a = amount -= requestedAmount;
            if (amount >= 0) {
                System.out.println("Заправили на : " + requestedAmount + "l. Залишилося на заправці : " + a + "l. Зправили за : " + refuelTime + "sec.");
            } else {
                System.out.println("Хотіли заправити на : " + requestedAmount + "l. На заправці було б : " + a + "l. Не вистачає палива. Time : " + refuelTime + "sec.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

}
