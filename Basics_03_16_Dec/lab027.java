package Basics_03_16_Dec;

public class lab027 {
    public static void main(String[] args) {

        //Type casting - Mold
        //widening is the process of converting lower type into higher type.

        byte b = 10;
       // int a = b;// Implicit Casting - JVM
        int a = (int) b;//Explicit Casting - JVM
        System.out.println(a);

        // Narrowing is the process of converting higher type to lower type.
        int a1 = 300;
        // byte b1 = a1; // Invalid - Implicit Casting
        byte b1 = (byte)a1; // Explicit casting
        System.out.println(b1);

        // 32 Bits
        // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
        // will be sotred into the b
        // 0 0 1 0 1 1 0 0
//        0 * 27 + 0 * 26 + 1 * 25 + 0 * 24 + 1 * 23 + 1 * 22 + 0 * 21 + 0 * 20
//        0 + 0 + 32 + 0 + 8 + 4 + 0 + 0
        //44

    }
}
