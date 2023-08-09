public class Shadow {
    static int a = 100;

    public static void main(String[] args) {
        System.out.println(a);
        int a = 1;
        System.out.println(a);
        fun();

    }

    static void fun() {
        int a = 20;
        System.out.println(a);
    }

}