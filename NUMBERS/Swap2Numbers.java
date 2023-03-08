package NUMBERS;

public class Swap2Numbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("First Value : "+a);
        System.out.println("Second Value : "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("First Value : "+a);
        System.out.println("Second Value : "+b);
    }
}
