package Basics_03_16_Dec;

public class lab038 {
    public static void main(String[] args) {

        // Ternary operator.

        //int a =  condition ?  if this is true print do this :  If false do this

        // MAX in three number?

        int a = 40;
        int b = 20;
        int c = 32;

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max);
    }
}
