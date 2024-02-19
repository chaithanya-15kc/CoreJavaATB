package Basics_03_16_Dec;

public class lab031 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; //valid- implicit casting
        int a1 = (int)b; // valid - Explicit casting
        System.out.println(a);
        System.out.println(a1);
    }
}
