package Basics_03_16_Dec;

public class lab037 {
    public static void main(String[] args) {
        //Ternary operator

        // find the maximum in 2 numbers

        int a = 10;
        int b = 20;
        int max = a < b ? b : a;
        int min = a < b ? a : b;

        System.out.println(max);
        System.out.println(min);
    }
}
