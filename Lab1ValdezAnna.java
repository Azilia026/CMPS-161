/*
Anna Valdez
31 August 2022
This program will find the perrimiter and the area of a square
*/
import java.util.Scanner;

public class Lab1ValdezAnna{
   
      public static void main (String[] args){
      
         System.out.println("This program will calculate the perimeter and area of a square"); //Prints description of program
      
            Scanner input = new Scanner(System.in);
            
         System.out.print("Enter the length of a side of your square: "); // Promts user to input lenght of a side of a square
            double length = input.nextDouble();
            
            double area = length*length; // Calculates area
            double perimeter = 4*length; // Calculates Perimeter
               
         System.out.println("We can calulate the perimeter of a square with the formula: preimeter = 4*(length of a side)");
         
         System.out.println("The perimeter of the square = "+ perimeter);
         
         System.out.println("We can calculate the area of the square with the formula: area = (length of a side)^2");
      
         System.out.println("The area of the square = "+ area);
      
      
      }
}