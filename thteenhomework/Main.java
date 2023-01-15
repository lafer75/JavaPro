package thteenhomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {
    public static Object countOccurance(List<String> list, String name) {
        int count = 0;
        for (String s : list) {
            if (s.contains(name)) {
                count++;
            }
        }
        System.out.println("Загадане слово : " + name + ", індекс під якім він стоїть : " + count);
        return list;
    }

    public static Object[] toList(List<String> listt, String[] str) {
        str = new String[]{"1", "2", "3", "4"};
        listt = Arrays.asList(str);
        System.out.println("str " + Arrays.toString(str));
        System.out.println("list " + listt);
        return new Object[]{listt, str};
    }

    public static void findUnique(int[] array) {
        List<Integer> myList = new ArrayList<>();
        for (int x : array) {
            if (!myList.contains(x))
                myList.add(x);
        }
        System.out.println(myList);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Tom", "Second", "Sunshine", "Football", "Lake", "Ocean", "Boom", "Volleyball",
                "Ball", "Cake", "Sunshine", "Come on", "Shake", "Pharmaceutic", "Rarely", "Sunshine", "True"));
        String[] str = new String[0];
        List<String> listt = null;
        int[] array;
        countOccurance(list, "Sunshine");
        System.out.println("------------------------------------------------------");
        toList(listt, str);
        System.out.println("------------------------------------------------------");
        findUnique(new int[]{3, 7, 13, 984, 13, 78, 7, 7, 7, 3, 13, 67, 54});
    }
}
