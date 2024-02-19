package Basics_03_16_Dec;

public class lab023 {
    public static void main(String[] args) {
        // OR - ||
        //T || T -> T, (true || true -> True)
        //T || F -> T, (true || false -> True)
        //F || T -> T, (false || true -> True)
        //F || F -> F, (false || false -> false)

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //AND - &&
        //T && T -> T,(true && true -> True)
        //T && F -> F,(true && false -> false)
        //F && T -> F,(false && true -> false)
        //F && F -> F, (false && false -> false)

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

    }
}
