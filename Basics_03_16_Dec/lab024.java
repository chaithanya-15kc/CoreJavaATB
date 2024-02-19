package Basics_03_16_Dec;

public class lab024 {
    public static void main(String[] args) {
        int a = 12;
        boolean b = !(a > 10 || a < 5); // !( 12>10 || 12<5)
                                        // !( true || False) - !(True) = False.
        System.out.println(b);
    }
}
