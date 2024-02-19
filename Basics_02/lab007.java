package Basics_02;

public class lab007 {
    public static void main(String[] args) {
        // program - difference between printLn vs printf
        String age = "Hello";
        //%d -> any integer - byte, short, int or long
        //%s -> String
        //%c -> char
        //%f -> float
        System.out.println(age);
        System.out.printf("your age is %s", age);
    }
}
