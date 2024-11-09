package Java_Coding_Challenge_1_30days;

import java.util.Scanner;

public class day3_conditional_statement {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                scan.close();
                System.out.println(((n & 1) == 1 || (6 <= n && n <= 20)) ? "Weird" : "Not Weird");
                System.out.println(6 & 1);//if n is even will get = 0;if n is odd will get = 1;
        }
}
