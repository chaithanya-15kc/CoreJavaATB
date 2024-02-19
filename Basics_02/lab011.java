package Basics_02;

public class lab011 {
    public static void main(String[] args) {
        char c= 'A';
        System.out.println(c);

       // char c1 = "$"; //"" is String
        char c1 = '$'; // '' is character
        System.out.println(c1);

        char c2 = '\n';
        System.out.println(c2);

        char c3 = '\u1F60'; //unicode -> :), (:, :| they created using unicode character
        System.out.println(c3);

        // ASCII Table
        // 0-9 48-57
        // A-Z 65-90
        // a-z 97-122
        // 0-9 48-57

        char c10 = '\u0062';
        System.out.println(c10);

        //Decimal System
        int age = 100;

        //Octal
        int b= 0101;

        //Binary
        int b2 = 0b101;

        //Hexa
        int c45 = 0Xface;
        System.out.println();



    }
}
