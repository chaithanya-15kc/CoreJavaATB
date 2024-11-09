package Java_Coding_Challenge_1_30days;

import java.util.Scanner;

public class day1_helloworld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //read the scanner class to read from stdin
        String inputString = scan.nextLine(); //read a line of input and save it to variable
        scan.close();

        //your first line of output goes here
        System.out.println("Hello World");
        System.out.println(inputString);

    }
}
