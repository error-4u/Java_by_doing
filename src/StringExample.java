//public class StringExample {
//    public static void main(String[] args) {
//        String ans = greet();
//        System.out.println(ans);
//    }
//
//    static String greet(String name = "vishal"){
//        String greeting = "hello";
//        return greeting;
//    }
//
//}

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String naam = in.next();
      String mainmessage = greet(naam);
        System.out.println(mainmessage);

    }

    static String greet (String name){
        String message = "hello " +name;
        return message;

    }
}