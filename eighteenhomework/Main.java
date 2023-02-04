package eighteenhomework;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        Integer[] value = new Integer[5];
       for(int i = 0;i< value.length;i++){
           value[i] = (int)(Math.random()*100);
       }
        System.out.println(toList(value));
    }

    static <T> List toList(T[] mus) {
        return List.of(mus);
    }
}
