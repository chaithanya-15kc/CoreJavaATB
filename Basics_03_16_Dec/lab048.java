package Basics_03_16_Dec;

import java.util.Scanner;

public class lab048 {
    public static void main(String[] args) {
        // Take two input from user and give max out of two number
        // a,b  a>b -> a, else b

        Scanner sc = new Scanner(System.in);//OOPs
        System.out.println("Enter a,b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println("Max is " + a);
        } else {
            System.out.println("Max is " + b);
        }

        // concatenation - combine two or more things
    }
}
