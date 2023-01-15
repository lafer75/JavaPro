package thteenhomework.phonebook;


import java.util.ArrayList;

import java.util.List;


public class PhoneDirectory {
    private static List<Recording> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add(new Recording("a", "qwe121"));
        list.add(new Recording("b", "qwe122"));
        list.add(new Recording("c", "qwe123"));
        list.add(new Recording("d", "qwe124"));
        list.add(new Recording("b", "qwe125"));
        list.add(new Recording("c", "qwe126"));
        list.add(new Recording("f", "qwe127"));

        find("d");
    }

    public static void find(String name) {
        for (Recording rec : list) {
            if (rec.getName().equalsIgnoreCase(name)) {
                System.out.println("Name : " + rec.getName() + ", Number : " + rec.getPhone());
                break;
            }
        }
    }
}