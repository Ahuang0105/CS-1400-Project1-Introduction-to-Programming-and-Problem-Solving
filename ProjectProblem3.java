// Alan C Huang
    // William Broer
        // CS 1400-02
            // Project 1

package projectproblem3;

import java.util.Scanner;
import java.util.Random;

public class ProjectProblem3 {

   
    public static void main(String[] args) 
    {
     //Setting variable   
     String choice = "YES" ;
     String computer;
     
     
     while (!choice.equals("NO"))
     {     
        //get variable back from methods
        computer = computerChoise();
        //get variable back from methods 
        choice = userChoice();
        //this method will determine if the player enter the right key words
       
        determineWinner(computer, choice);
     }
     
        System.out.println(" ");   
        System.out.println(" ");
        System.out.println("***************************************");
        System.out.println("*              GAME OVER              *");
        System.out.println("***************************************");
    }
    
    public static String computerChoise()
    {
        String computerChoice = " ";
        
        //use random number for computer
     Random randomNumbers = new Random();
     int computerRan = randomNumbers.nextInt(3)+1;
     
     switch (computerRan)
     { 
         case 1:
         {
             computerChoice = "ROCK";
         }
         
         break;
         
         case 2:
         {
             computerChoice = "PAPER";
         }
         
         break;
         
         case 3:
         {
             computerChoice = "SCISSORS";
         }
         
         default:
             
             break;
         
     }
     
     
        return computerChoice;
    }
    
    public static String userChoice()
    {
        String playerChoice = " ";
        
        boolean user = false;
        
        while ( user !=true )
        
        {
        
        Scanner input = new Scanner (System.in);
        System.out.println("***************************************");
        System.out.println("*Please enter Rock, Paper, or Scissors*");
        System.out.println("*Enter No to stop the game.           *");
        System.out.println("***************************************");
        System.out.println("");
        System.out.print("-->");
        playerChoice = input.next();
        playerChoice = playerChoice.toUpperCase();
        
        
        user = isValidChoice (playerChoice);
            
        
        }
        // if the plater enter is right then system will determine the winner
     
       
        return playerChoice;   
         
    }
    
    public static  boolean isValidChoice (String choice)
    {
        boolean status;
        
        if (choice.equals("ROCK") 
                == choice.equals("SCISSORS") 
                     == choice.equals("PAPER"))
        {    
            status = true;
        }
        
        else status = choice.equals("NO");
        
        return status;
    }
    
    public static void determineWinner(String computer, String user)
    {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("___________________________________");
        System.out.println(" You choose :"+user);
        System.out.println(" Computer choice :" +computer);
        System.out.println("-----------------------------------");
        
        
        switch (computer) {
            case "ROCK":
                if (user.equals("PAPER") )
                {
                    System.out.println("***********");
                    System.out.println("* You WIN *");
                    System.out.println("***********");
                }
                
                else if (user.equals("SCISSORS") )
                {
                    System.out.println("************");
                    System.out.println("* You LOSE *");
                    System.out.println("************");
                }
                
                else if ( computer.equals(user) )
                {
                    System.out.println("*******");
                    System.out.println("* TIE *");
                    System.out.println("*******");
                }     break;
            case "PAPER":
                if (user.equals("ROCK") )
                {
                    System.out.println("************");
                    System.out.println("* You LOSE *");
                    System.out.println("************");
                }
                
                else if (user.equals("SCISSORS") )
                {
                    System.out.println("***********");
                    System.out.println("* You WIN *");
                    System.out.println("***********");
                }
                
                else if ( computer.equals(user) )
                {
                    System.out.println("*******");
                    System.out.println("* TIE *");
                    System.out.println("*******");
                }     break;
            case "SCISSORS":
                if (user.equals("ROCK") )
                {
                    System.out.println("***********");
                    System.out.println("* You WIN *");
                    System.out.println("***********");
                }
                
                else if (user.equals("PAPER") )
                {
                    System.out.println("************");
                    System.out.println("* You LOSE *");
                    System.out.println("************");
                }
                
                else if ( computer.equals(user) )
                {
                    System.out.println("*******");
                    System.out.println("* TIE *");
                    System.out.println("*******");
                }     break;
            default:
                break;
        }
       
      
    }
    
}
