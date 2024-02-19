package Basics_03_16_Dec;

public class lab041 {
    public static void main(String[] args) {

        //increment operator
        int a=20;
        System.out.println(++a + a++ + a++); // 21+21+22 = 64
        System.out.println(a);//23

        // Part - A ( Exp = 21, a = 21  ) -> ++a -> O/P -> 21
        // Part - B ( Exp = 21, a = 22  ) -> a++ -> O/P -> 21
        // Part - C ( Exp = 22, a = 23  ) -> a++ -> O/P -> 22
        // A+B+C -> 21+21+22 -> 64, a -> 23
    }
}
