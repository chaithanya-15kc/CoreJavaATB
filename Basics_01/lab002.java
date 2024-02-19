package Basics_01;

public class lab002 {
    public static void main(String[] args) {
        //keywords -> simple english words
        //package, public, class - Reserved words
        //keywords are in lowercase
        //we cant use keywords as variables

        byte age = 10; //Range of byte -128 to 127
        age = 127; //out of range
        System.out.println(age+1);
        //age = age + 1;
        System.out.println(age);

        //Local variable - age

        short _age = 128; // -32768 to 32678
        System.out.println(_age);

        //age & _age are two different local variables

    }
}
