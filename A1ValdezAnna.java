/*
Anna Valdez
12 September 2022
This program will calculate a new bill amount based on 
a usesr given percentage tip and the original bill amount
*/

import java.util.Scanner;

public class A1ValdezAnna {//start class

   public static void main(String[] args){//start main
   
      Scanner input = new Scanner(System.in);

      System.out.println("This program will calculate a new total bill amount based on your original bill and a percentage tip.");

      System.out.println("The final bill total will be rounded to the nearest dollar."); //prints instucions for program

      System.out.print("Enter the original bill amount (with no dollar sign): "); //prompts user for bill amount

         double bill = input.nextDouble();

      System.out.print("Enter the tip percentage (with no percent sign): ");//promts user for percent amount

         double percent = input.nextDouble();

         double total = bill*((percent/100+1));

      System.out.println("Your new bill is: " + Math.round(total)); //prints final amount
   
   }//end main
   
}//end class
