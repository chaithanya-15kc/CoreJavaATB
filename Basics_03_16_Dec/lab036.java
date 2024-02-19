package Basics_03_16_Dec;

public class lab036 {
    public static void main(String[] args) {
        //Ternary operator
        //int a =  condition ?  if this is true print do this :  If false do this

        int a = true ? 10 : 20;
        int a1 = (20>50) ? 10 : 20;
        System.out.println(a);
        System.out.println(a1);

        String str1 = 10 > 20 ? "TEN" : "TWENTY";
        System.out.println(str1);

        String anil_status = true ? "Yes" : "No";
        System.out.println(anil_status);

        String chai_status = true ? "Yes" : "No";
        System.out.println(chai_status);
    }
}
