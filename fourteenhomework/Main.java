package fourteenhomework;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileNavigator navi = new FileNavigator();

        System.out.println("add()");
        navi.add(new FileData("File1.txt", 51, "fourteenhomework1/"));
        navi.add(new FileData("File2.txt", 89, "fourteenhomework4/"));
        navi.add(new FileData("File3.txt", 21, "fourteenhomework3/"));
        navi.add(new FileData("File4.txt", 5, "fourteenhomework1/"));
        navi.add(new FileData("File5.txt", 24, "fourteenhomework2/"));
        navi.add(new FileData("File6.txt", 9, "fourteenhomework5/"));
        navi.add(new FileData("File7.txt", 51, "fourteenhomework4/"));
        navi.add(new FileData("File8.txt", 11, "fourteenhomework2/"));
        navi.add(new FileData("File9.txt", 21, "fourteenhomework1/"));
        System.out.println();


        System.out.println("find()");
        System.out.println(navi.find("fourteenhomework1/"));
        System.out.println(navi.find("fourteenhomework2/"));
        System.out.println(navi.find("fourteenhomework3/"));
        System.out.println(navi.find("fourteenhomework4/"));
        System.out.println(navi.find("fourteenhomework5/"));
        System.out.println();

        System.out.println("filterBySize()");
        System.out.println(navi.filterBySize(15));
        System.out.println();

        System.out.println("remove()");
        String removedPath = navi.remove("fourteenhomework4/");
        System.out.println("Видалений путь: " + removedPath);
        System.out.println();


    }

}
