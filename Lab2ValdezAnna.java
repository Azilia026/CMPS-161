/*
Anna Valdez
10/17/2022
This program will check whether an entered character is a digit, an upper or lowercase vowel, or an upper or lowercase consonant.
*/
import java.util.Scanner;

public class Lab2ValdezAnna{//begin class

   public static void main (String[] args){//begin main

      Scanner input = new Scanner(System.in);
      
      System.out.println("This program will determine whether an entered character is a digit, vowel, or consonant. If it is a vowel or consonant it will also check if it is uppercase or lowercase.");
      
      System.out.print("Enter your character to check: "); //prompts user for input
      
         char test = input.next().charAt(0);
      
      if(test>='A' && test<='Z') //for uppercase letters
         if(test=='A' || test=='E' || test=='I' || test=='O' || test=='U')
            System.out.println(test + " is an uppercase Vowel");
         else
            System.out.println(test + " is an uppercase Consonant");
         
      else if(test>='a' && test<='z') //for lowercase letters
          if(test=='a' || test=='e' || test=='i' || test=='o' || test=='u')
            System.out.println(test + " is an lowercase Vowel");
          else
            System.out.println(test + " is an lowercase Consonant");

         
      else if(test>='0' && test<='9')//for numbers
         System.out.println(test + " is a digit");
      
      else //other
         System.out.println(test + " is not a digit or letter.");
         
   }//end main
}//end class