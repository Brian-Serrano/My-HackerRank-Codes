import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        String[] items = s.trim().split("[ !,?.\\_'@]+");
        
        if(s.length() == 0) System.out.println("0");
        else if(s.length() > 400000) return;
        else System.out.println(items.length);
        
        for(String item : items){
            System.out.println(item);
        }
        
        scan.close();
    }
}
