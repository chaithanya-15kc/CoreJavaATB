package Java_Coding_Challenge_1_30days;

import java.util.Scanner;

public class day3_operators {
    public static void main(String[] args) {
        //arithmetic operators
        //meal_cost = 12, tip_percent= 20, tax_percent = 8
        //A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value  and return from the function.
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();//original meal price
        int tipPercent = scan.nextInt();//tip percentage
        int taxPercent = scan.nextInt();//tax percentage
        scan.close();

        // Calculate Tax and Tip:
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;

        int totalCost = (int) Math.round(mealCost + tax + tip);

        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
