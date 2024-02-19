package Basics_03_16_Dec;

public class lab032 {
    public static void main(String[] args) {
        String name = "The Testing Academy";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String name2 = new String("The Testing Academy"); //OA? HEAP Area
        System.out.println(name2);
    }
}
