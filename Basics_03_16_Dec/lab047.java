package Basics_03_16_Dec;

import java.util.Scanner;

public class lab047 {
    public static void main(String[] args) {

        //take the input from user ? in java how?
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number, I will tell if it is even/odd");
         int a = sc.nextInt();

         if(a%2 == 1) {
             System.out.println("ODD Number");
         }else{
             System.out.println("Even Number");
         }
    }
}
