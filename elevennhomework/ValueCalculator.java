package elevennhomework;

public class ValueCalculator {
    private final int fullLength = 1_000_000;
    private final int halfLength = fullLength / 2;
    private float[] fullArray = new float[fullLength];

    public long calculate() {
        long start = System.currentTimeMillis();
        printArray(fullArray);
        for (int i = 0; i < fullLength; i++) {
            fullArray[i] = 1;
        }
        printArray(fullArray);
        float[] firstPart = new float[halfLength];
        float[] secondPart = new float[halfLength];
        System.arraycopy(fullArray, 0, firstPart, 0, halfLength);
        System.arraycopy(fullArray, halfLength - 1, secondPart, 0, halfLength);
        CalculateTread tr1 = new CalculateTread(firstPart);
        CalculateTread tr2 = new CalculateTread(secondPart);
        tr1.start();
        tr2.start();

        final float[] result = new float[fullLength];
        while (tr1.isAlive() || tr2.isAlive())
            System.arraycopy(firstPart, 0, result, 0, halfLength);
        System.arraycopy(secondPart, 0, result, halfLength, halfLength);
        printArray(result);
        return System.currentTimeMillis() - start;
    }

    public void printArray(final float[] array) {
        System.out.println("1: " + array[0]);
        System.out.println("500_000: " + array[halfLength - 1]);
        System.out.println("500_001: " + array[halfLength]);
        System.out.println("1_000_000: " + array[fullLength - 1]);
    }

}
