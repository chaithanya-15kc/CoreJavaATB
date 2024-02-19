package Basics_03_16_Dec;

public class lab030 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        String s1 = "Chaithanya";
        String s2 = "Rushank";
        System.out.println(a+b+s1+s2);//integer addition + string addition
        System.out.println(s1+s2+a+b);//String addition + integer addition-it will not do addition.
        System.out.println(s1+s2+(a+b)); //BODMAS
    }
}
