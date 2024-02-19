package Basics_03_16_Dec;

public class lab033 {
    public static void main(String[] args) {

        String name = "The testing";
        String name1 = "The testing";
        String name2 = new String("The Testing academy"); // Heap area

        System.out.println(name == name1);
        System.out.println(name.equals(name1));

        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));

    }
}
