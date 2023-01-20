package twelvеhomework;

import java.util.ArrayList;
import java.util.List;

public class MainThread {
    public static void main(String[] args) {
        ThreadSafeList threadSafeList = new ThreadSafeList();
        System.out.println("add()");
        threadSafeList.add("baba");
        threadSafeList.add("switch");
        threadSafeList.add("add");
        threadSafeList.add("cat");

        System.out.println("get()");
        threadSafeList.get(0);
        threadSafeList.get(2);
        threadSafeList.get(5);

        System.out.println("remove()");
        threadSafeList.remove(3);
    }
}
