/*
Anna Valdez
7 November 2022
This program will take in a user inputed array, then return the max value, min value, when they were entered, the average, and how many values were above or below average.
*/
import java.util.Scanner;
public class A5ValdezAnna{
   public static void main (String[] args){
      
      System.out.println("This program will take in a given number of values.");
      
      System.out.println("It will then return:");
      
      System.out.printf("1) The maximum value entered %n2) When in the list it was entered. %n3) The minimum value entered. %n4) When in the list it was entered. %n5) The average of the list of values. %n6) How many values in the list are above the average. %n7) How many values in the list are below the average.%n");
      
         Scanner input = new Scanner(System.in);
      System.out.print("How many values do you want to enter: ");//promts user for array length
         int length = input.nextInt();
     
         double[] myList = new double[length];
      System.out.print("Enter your " + length + " values: ");//prompts user for array values
         
         for (int i = 0; i<length; i++){
            myList[i] = input.nextDouble();//puts user input values into array
         }
         
      double average = average(myList, length);
           
      System.out.println("The max value in the array is: " + max(myList, length));
      
      System.out.println("The maximum value was entered as number " + (maxLocation(myList, length)+1));
      
      System.out.println("The min value in the array is: " + min(myList, length));
      
      System.out.println("The maximum value was entered as number " + (minLocation(myList, length)+1));
      
      System.out.println("The average value in the array is: " + average(myList, length));
      
      System.out.println("There are " + aboveAverage(myList, length, average) + " values above the average");

      System.out.println("There are " + belowAverage(myList, length, average) + " values below the average");
   }
   
   
   public static double max(double[] myList, int length){
      double max = myList[0];
         for (int i = 1; i<length; i++)
            if(myList[i]>max)
            max = myList[i];
         return max;
   }
   
   public static double maxLocation(double[] myList, int length){
     int index = 0;
     double max = myList[index];
   
       for (int i = 1; i < length; i++){
           if (myList[i] >= max){
           max = myList[i];
           index = i;
           }
       }
      return index;
   }
   
   public static double minLocation(double[] myList, int length){
     int index = 0;
     double min = myList[index];
   
       for (int i = 1; i < length; i++){
           if (myList[i] <= min){
           min = myList[i];
           index = i;
           }
       }
    return index;
   }

   
   public static double min(double[] myList, int length){
      double min = myList[0];
         for (int i = 1; i<length; i++)
            if(myList[i]<min)
            min = myList[i];
         return min;
   }
   
   public static double average(double[] myList, int length) {
    double sum = 0;
       for (double value : myList) {
           sum += value;
       }
       double average = sum/length;
       return average;
   }
   
   public static int aboveAverage(double[] myList, int length, double average){
      int count = 0;
         for(int i =0; i<length; i++)
            if (myList[i] > average)
            count++;
      return count;
   }
   
   public static int belowAverage(double[] myList, int length, double average){
      int count = 0;
         for(int i =0; i<length; i++)
            if (myList[i] < average)
            count++;
      return count;
   }
}

