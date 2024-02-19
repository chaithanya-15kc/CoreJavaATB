package Basics_01;

import java.util.Scanner;

public class lab001 {
    public static void main(String[] args) {
        System.out.println("Hello world");

        //switch operation example
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1-7");
        int dayNumber = sc.nextInt();

//        String day = null;

        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thur");
                break;
            default:
                System.out.println("Are you mad");
        }

        System.out.println("end of the program");

    }

}
