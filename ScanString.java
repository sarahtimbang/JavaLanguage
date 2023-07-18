import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "This is a String ";
		
        Scanner scan = new Scanner(System.in);

        int var1 =scan.nextInt();
        double var2 =scan.nextDouble();
        scan.nextLine();
        String var3= scan.nextLine();
        
       
        System.out.println(var1 + i);
      
        System.out.println(var2 + d);

        System.out.println(s + var3);
        
 

        scan.close();
    }
}
