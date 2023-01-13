package elevenhomework;

import java.util.Arrays;

public class Flow implements Runnable{

    public void runn(float[] mas, int a) {
        Arrays.fill(mas,  (float)(mas[a] * Math.sin(0.2f + a / 5) * Math.cos(0.2f + a / 5) * Math.cos(0.4f + a / 2)));
        System.out.println("mas = " + mas);
    }

    @Override
    public void run() {

    }
}
