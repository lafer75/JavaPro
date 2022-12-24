package sixhomework;

import java.util.Random;
import java.util.Scanner;

import static jdk.internal.joptsimple.internal.Messages.message;

public class Main {
    private static void findSymbolOccurance(String habr, char searchChar) {
        int length = habr.length();
        int a = 0;
        for (int i = 0; i < length; i++) {
            if (habr.charAt(i) == searchChar) {
                a++;
            }
        }
        System.out.println("Ось стільки букв " + searchChar + ": " + a);
    }

    private static void findWordPosition(String a, String b, String one, String two) {
        int value = a.indexOf(one, 0);
        System.out.println(value);
        int values = b.indexOf(two, 0);
        System.out.println(values);
    }

    private static void stringReverse() {
        String inputString = "java";
        String reversedString = new StringBuffer(inputString).reverse().toString();
        System.out.println("reversedString = " + reversedString);
    }

    private static void isPalindrome(String a) {
        int length = a.length();
        for (int i = 0; i < (length / 2); i++) {
            if (a.charAt(i) != a.charAt(length - i - 1)) {
                System.out.println(a + " : " + false);
                break;
            }
            System.out.println(a + " : " + true);
            break;

        }
    }


    public static void main(String[] args) {
        findSymbolOccurance("fghfghfghfghfghfgh", 'h');
        System.out.println("---------------------------------------------------------");
        findWordPosition("Apollo", "Madrid", "pollo", "cdrid");
        System.out.println("---------------------------------------------------------");
        stringReverse();
        System.out.println("---------------------------------------------------------");
        isPalindrome("EREe");
        System.out.println("---------------------------------------------------------");

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        int word = random.nextInt(words.length);
        String wor = words[word];
        String scane = scan.nextLine();
        int worLength = wor.length();
        int scaneLenght = scane.length();
        System.out.println("wor  " + wor);

        System.out.println("worLength = " + worLength);
        if (wor.equals(scane)) {
            System.out.println("Супер!!! Ви вгадали слово  " + wor);
        }
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int i = 4;
        int f = 5;
        int s = 0;
        if (s < wor.length()){
            System.out.print(wor.charAt(s));
            s++;
            if (s < wor.length()){
                System.out.print(wor.charAt(s) + "#############\n");
                s++;
                String o = scan.nextLine();
            }else{
                System.out.print(wor.charAt(s) + "#############\n");
                s++;
                String o = scan.nextLine();
            } if (s < wor.length()) {
                System.out.print(wor.charAt(s-2) +""+wor.charAt(s-1) +wor.charAt(s));
                s++;
                if (s < wor.length()) {
                    System.out.print(""+wor.charAt(s) +"#############\n");
                    s++;

                    String o = scan.nextLine();
                } else {
                    System.out.print(wor.charAt(s-3) +""+wor.charAt(s-2) +""+wor.charAt(s-1) +wor.charAt(s) + "#############\n");
                    s++;
                    String o = scan.nextLine();
                }
            }
            if (s < wor.length()) {
                System.out.print(wor.charAt(s));
                s++;
                if (s < wor.length()) {
                    System.out.print(wor.charAt(s) + "#############\n");
                    s++;
                    String o = scan.nextLine();
                } else {
                    System.out.print(wor.charAt(s) + "#############\n");
                    s++;
                    String o = scan.nextLine();
                }
            }

        }
 //       if (a < wor.length()) {
   //         if (scane == wor) {
        //         System.out.println("Супер!!! Ви вгадали слово  " + wor);
        //    }
        //    System.out.print(wor.charAt(a));
        //}
        //if (b < wor.length()) {
          //  System.out.print(wor.charAt(b) + "#############\n");
            //String g = scan.nextLine();
//
  //      }
    //    if (c < wor.length()) {
      //      System.out.print(wor.charAt(c));
        //}
       // if (d < wor.length()) {
         //       System.out.print(wor.charAt(d) + "#############\n");
           //     String g = scan.nextLine();
            //}else {
              //  System.out.print(wor.charAt(c) + "#############\n");
               // String g = scan.nextLine();
        //}
        //if (i < wor.length()) {
          //  System.out.print(wor.charAt(i));
        //}else{

        //}
        //if (f < wor.length()) {
          //      System.out.print(wor.charAt(f) + "#############\n");
            //    String g = scan.nextLine();
            //}else {
              //  System.out.print(wor.charAt(f) + "#############\n");
                //String g = scan.nextLine();
            //}





//        for (int i = 3; i < worLength;){
//            System.out.print(wor.charAt(i));
        //          i++;
        //  System.out.print(wor.charAt(i) + "#############\n");
        //  i++;
        //  String a = scan.nextLine();
        //}
        //for (int i = 5; i < worLength;){
        //  System.out.print(wor.charAt(i));
        //  i++;
        //  System.out.print(wor.charAt(i) + "#############\n");
        //  i++;
        //  String a = scan.nextLine();
        //for (int i = 7; i < worLength;){
        //  System.out.print(wor.charAt(i));
        //  i++;
        //  System.out.print(wor.charAt(i) + "#############\n");
        //  i++;
        //  String a = scan.nextLine();
        //}


        System.out.println(" = " + wor.charAt(2));

    }

}
//    (scane.charAt(0)==wor.charAt(0))