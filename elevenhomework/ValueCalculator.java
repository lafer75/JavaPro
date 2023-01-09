package elevenhomework;

import java.util.Arrays;
import java.util.Random;

public class ValueCalculator {
    public static void main(String[] args) {
        Random rand = new Random();
        float min = 1000000;
        float max = 214748364;
        float a = rand.nextInt((int) ((max - min) + 1)) + min;
        float b = a / 2;
        float[] mas = new float[(int) a];
        System.out.println(mas.length);
        System.out.println(b);
        doValueCalculator(mas, (int) a);
    }

    public static void doValueCalculator(float[] mas, int a) {
        long start = System.currentTimeMillis();
        Arrays.fill(mas, 1);
        float[] c = new float[(mas.length + 1) / 2];
        float[] d = new float[mas.length - c.length];
        System.arraycopy(mas, 0, c, 0, c.length);
        System.arraycopy(mas, c.length, d, 0, d.length);
        System.out.println(c.length);
        System.out.println(d.length);
        Thread thread = new Thread(new Flow());
        thread.runn();
    }
}
