/*
Anna Valdez
22 September 2022
This program will take a number input from the user and correlate it to an operation, then take two more inputs from the user and perform the chosen operation
*/
import java.util.Scanner;

public class NormalCalculatorValdezAnna{//start class

   public static void main(String[] args){//start main
   
      System.out.println("Welcome to the Greatest Calculator of all Time.");
      
         Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, or 5 for modulus.");
   
         double operation = input.nextDouble();
      
            if(operation == 1){ //beginning of addition
               
               System.out.print("Enter the first operand of the equation:");
            
               double number1 = input.nextDouble();
               
               System.out.print("Enter the second operand of the equation:");
            
               double number2 = input.nextDouble();
               
               System.out.println("The answer is " + (number1+number2));
            }//end of addition
            
            else if(operation == 2){//beginning of subtraction
               
               System.out.print("Enter the first operand of the equation:");
            
               double number1 = input.nextDouble();
               
               System.out.print("Enter the second operand of the equation:");
            
               double number2 = input.nextDouble();
               
               System.out.println("The answer is " + (number1-number2));
            
            }//end of subtraction
            
            else if(operation == 3){//beginning of multiplication
               
               System.out.print("Enter the first operand of the equation:");
            
               double number1 = input.nextDouble();
               
               System.out.print("Enter the second operand of the equation:");
            
               double number2 = input.nextDouble();
               
               System.out.println("The answer is " + (number1*number2));
            
            }//end of multiplication
            
            else if(operation == 4){//beginning of division
               
               System.out.print("Enter the first operand of the equation:");
            
               double number1 = input.nextDouble();
               
               System.out.print("Enter the second operand of the equation:");
            
               double number2 = input.nextDouble();
               
               System.out.println("The answer is " + (number1/number2));
            }//end of division
            
            else if(operation == 5){//beginning of modulus
               
               System.out.print("Enter the first operand of the equation:");
            
               double number1 = input.nextDouble();
               
               System.out.print("Enter the second operand of the equation:");
            
               double number2 = input.nextDouble();
               
               System.out.println("The answer is " + (number1%number2));
            
            }//end of modulus
         
         else {
         System.out.println("This value is invalid, run the program again and enter a value from 1-5.");
   
         }
  
   }//end main
   
}//end class