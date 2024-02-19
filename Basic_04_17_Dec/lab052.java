package Basic_04_17_Dec;

import java.util.Scanner;

public class lab052 {
    public static void main(String[] args) {

        //Garde calculator

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the student score");
        int score = sc.nextInt();

        if(score >= 90 && score <= 100){
            System.out.println("Your Score: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("your score: B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("your score: C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("your score: D");
        } else {
            System.out.println("your score: F");
        }


    }
}
