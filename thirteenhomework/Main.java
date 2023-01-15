package thirteenhomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static Object countOccurance(List<String> list, int number) {
        int count = 0;
        for (String b : list) {
            number = (int) (Math.random() * 15);
            System.out.println(list.get(number));
        }
        for (String s : list) {
            if (s.equals(list.get(number))) {
                count++;
            }
        }
        for()
        System.out.println("count = " + count);
        return list;
    }

    public static Object[] toList(List<String> listt, String[] str) {
        str = new String[]{"1", "2", "3", "4"};
        listt = Arrays.asList(str);
        System.out.println("str "+ Arrays.toString(str));
        System.out.println("list "+listt);
        return new Object[]{listt, str};
    }
    public static void findUnique(int[] array){
        List<Integer> myList = new ArrayList<>();
        for (int x : array) {
            if (!myList.contains(x))
                myList.add(x);
        }
        System.out.println(myList);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Tom", "Second", "Football", "Lake", "Ocean", "Boom", "Volleyball",
                "Ball", "Cake", "Sunshine", "Come on", "Shake", "Pharmaceutic", "Rarely", "True"));
        String[] str = new String[0];
        List<String> listt = null;
        int[] array;
        countOccurance(list, 0);
        System.out.println("------------------------------------------------------");
        toList(listt, str);
        System.out.println("------------------------------------------------------");
        findUnique(new int[]{3,7,13,984,13,78,7,7,7,3,13,67,54});
    }
}
