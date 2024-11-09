package Java_Coding_Challenge_1_30days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class day8_dictonary_maps {
    public static void main(String[] args) {
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            String name = scan.next();
            int phone = scan.nextInt();
            phoneBook.put(name, phone);
        }
        while(scan.hasNext()){
            String s = scan.next();
            Integer phoneNumber = phoneBook.get(s);
            System.out.println(
                    (phoneNumber != null)
                            ? s + "=" + phoneNumber
                            : "Not found"
            );
        }
        scan.close();
    }

}
