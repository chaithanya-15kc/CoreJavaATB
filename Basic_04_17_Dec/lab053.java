package Basic_04_17_Dec;

import java.util.Scanner;

public class lab053 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your Score");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("You score -> A");
        }

        if (score >= 80 && score <= 89) {
            System.out.println("your score: B");
        }

        if (score >= 70 && score <= 79) {
            System.out.println("your score: C");
        }

        if (score >= 60 && score <= 69) {
            System.out.println("your score: D");
        }

        if (score >= 50 && score <= 59) {
            System.out.println("your score: F");
        }

    }
}
