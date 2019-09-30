// Alan C Huang
    // William Broer
        // CS 1400-02
            // Project 1

package projectproblem2;

import java.util.ArrayList;
import java.util.Scanner;
public class ProjectProblem2 {

    
public static void main(String[] args) {
        ArrayList <String> stringList = new ArrayList<String>();
        Scanner keyboard = new Scanner(System.in);
        
        String input = "YES ";
        int total = 0;
        
        while (!input.equals(" ")) 
        {
            System.out.println("******************************************");
        System.out.println("*Please enter any sentence to check if   *");
        System.out.println("*they are palindrome. Enter space to stop*");
        System.out.println("******************************************");
        
        input = keyboard.nextLine();
        stringList.add(input);
        }
    
        for (int x =0; x < (stringList.size()-1); x++)
        {
            System.out.println("\""+ stringList.get(x) +"\"");
            
            if (isPalindrome(stripString(stringList.get(x))))
            {
                System.out.println("*Is a palaindrome*"); 
                System.out.println("  ");
                total += 1;
            }
            
            else
            {
                System.out.println("*Is not a palindrome*");
                System.out.println("  ");
            }
        }
        System.out.println("  ");
        System.out.println("Total palaindrome sentence is " + total);
    
    }
    
    public static String stripString (String strip)
    {
       strip = strip.toUpperCase();
       String stripped = "";
       
       for (int i = 0; i < strip.length(); i++)
       {
           if (Character.isLetter(strip.charAt(i)))
               stripped += strip.charAt(i);
       } 
        
       return stripped; 
    }
    
    public static boolean isPalindrome (String str)
    {
        boolean status = false;
        
        
        if (str.length() <= 1)
        {
             
            status = true;
        }
        else if (str.charAt (0) == str.charAt(str.length( )-1)) 
        {
            status = isPalindrome (str.substring (1, str.length()-1));
        }
        
        
        return status;
    }
    
}
