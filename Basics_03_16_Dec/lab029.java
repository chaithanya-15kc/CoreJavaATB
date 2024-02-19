package Basics_03_16_Dec;

public class lab029 {
    public static void main(String[] args) {
        // String Constant Pool - SCP / String Pool
        String s1 = "Chaithanya";
        // new Operator - Object
        String s2 = new String("Chaithanya");
        //new operator is used to create the new object for class.
        // It returns of the address of newly created object.
        System.out.println(s2);
        System.out.println(new String("Chaithanya"));
    }
}
