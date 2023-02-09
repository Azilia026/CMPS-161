/*
Anna Valdez
26 October 2022
This program will read in a string from the user and make changes until the user wants to stop.
*/

import java.util.Scanner;

public class A4ValdezAnna{//start class
   
   public static void main(String[] args){//start main
      
      System.out.println("This program will read in a string and then allow you to make changes to it until you want to stop.");
      
         Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your string here: ");
      
         String answer = input.nextLine();////prompts for String
      
      System.out.println("Your current string is: " + answer);
      
      System.out.print("Do you want to make any changes? (Y/N): ");
      
         char cont = input.next().charAt(0);//prompts for loop condition
      
      
            while(cont=='Y'){//while
               System.out.print("Enter which character you would like to change in your string: ");
               
                  char letter = input.next().charAt(0);//prompts for a replacable letter

               System.out.print("Enter which character you would like to change it to: ");
               
                  char replace = input.next().charAt(0);//prompts for a replacement letter

               System.out.println("Your current string is: " + changeString(answer, letter, replace));

               answer = changeString(answer, letter, replace);

               System.out.print("Do you want to make any more changes? (Y/N): ");
               
                  cont = input.next().charAt(0);//prompts for loop condition
            }//while
         
      System.out.println("Your final string is: " + answer);
   }//main


   public static String changeString(String answer, char letter, char replace){//changeString

      String newString = answer.replace(letter, replace);//replaces the letters

      return newString;
   }//changeString
}//class

