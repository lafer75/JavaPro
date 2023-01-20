package twelvеhomework;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeList {
    List<String> list = new ArrayList<>();

    public void add(String text) {
        synchronized (list) {
            list.add(text);
        }
    }
    public String get (int i){
        synchronized (list){
            if(i<=list.size()){
                System.out.println(list.get(i));
            }else{
                System.out.println("Немає значення по такому індексу");
            }
        }
        return list.get(i);
    }
    public int remove(int a){
        synchronized (list){
            if(a<=list.size()){
                System.out.println("Видаленій шлях : "+list.get(a));
                list.remove(a);
            }else{
                System.out.println("Немає значення по такому індексу");
            }
        }
        return a;
    }
}
