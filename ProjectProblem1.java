// Alan C Huang
    // William Broer
        // CS 1400-02
            // Project 1

package projectproblem1;

import java.util.Scanner;
public class ProjectProblem1 {

    
    public static void main(String[] args) {
        
        int months;
        int days;
        
  
        System.out.println("-----------------------------"
               + "--------------------------------------"); 
        
       System.out.println("Please enter the months and "
               + "day you wish to check for the season"); 
       
       System.out.println("-----------------------------"
               + "--------------------------------------"); 
       
       System.out.println(" ");
        
       Scanner input = new Scanner (System.in);
       
       System.out.print("Please enter the month :  ");
       
       months = input.nextInt();
       
       System.out.print("Please enter the day :  ");
       
       days = input.nextInt();
       
    
     if (days >= 1 && days <= 31)  
     
     {     
         
     switch (months) {
           
               case 1:
                   
               System.out.println("The season is Winter ");
               
                        break;
               
               case 2:
                   
               System.out.println("The season is Winter ");
               
                        break;
               
               case 3:
                   
                  if (days > 20 )
                  
                      System.out.println("The season is Spring ");
                  
                  else 
                      
                      System.out.println("The season is Winter ");
               
                        break;
               
               case 4:
                   
               System.out.println("The season is Spring ");
               
                        break;
               
               case 5:
                   
               System.out.println("The season is Spring ");
               
                        break;
               
               
               case 6:
                   
                  if (days > 20 )
                  
                      System.out.println("The season is Summer ");
                  
                  else 
                      
                      System.out.println("The season is Spring ");
                  
                        break;
               
               case 7:
                   
               System.out.println("The season is Summer ");
               
                        break;
               
               case 8:
                   
               System.out.println("The season is Summer ");
               
                        break;
              
               
               case 9:
                   
               if (days > 20)
                  
                      System.out.println("The season is Fall ");
                  
                  else 
                      
                      System.out.println("The season is Summer ");
               
                        break;
               
               case 10:
                   
               System.out.println("The season is Fall ");
               
                        break;
               
               case 11:
                   
               System.out.println("The season is FAll ");
               
                        break;
               
               case 12:
                   
               if (days > 20 )
                  
                      System.out.println("The season is Winter ");
                  
                  else 
                      
                      System.out.println("The season is Fall ");
               
                        break;
               
               default:
               
               System.out.println("********************************************");
               System.out.println("Error pleas ENTER the "
                       + "right months and days ");
               System.out.println("********************************************");
               
                        break;    
           }
    
        }
     
        else
         
       {
         System.out.println("********************************************");
            System.out.println("Error pleas ENTER the "
                       + "right months and days ");
            System.out.println("********************************************");
        } 
     
    }
    
}
