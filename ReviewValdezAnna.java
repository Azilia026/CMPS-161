import java.util.Scanner;
public class ReviewValdezAnna{

   public static void main(String[] args){
      
      System.out.println("This program will read in 10 integer values and then sort them in descending order.");

         Scanner input = new Scanner(System.in);

      System.out.print("Please enter your 10 values: ");
      
         int[] myList = new int[10];
         
      for (int i = 0; i<10; i++){
            myList[i] = input.nextInt();//puts user input values into array
         }
      System.out.println("Sorting the Values from largest to smallest...");
      
         int[] sorted = sort(myList);
      
      System.out.print("The sorted array is: ");
         for (int i = 0; i < sorted.length; i++) {
               System.out.print(sorted[i] + " ");
         }

   }//end main
   public static int[] sort(int[] myList){
    int[] result = new int[myList.length];
      
      for (int i = 0; i < myList.length; i++){
         int currentMin = myList[i];
         int currentMinIndex = i;
         
         for (int j = i; j < myList.length; j++) {
            if (currentMin < myList[j]) {
               currentMin = myList[j];
               currentMinIndex = j;
            }//end if
         }//end for
         
         if (currentMinIndex != i) {
            myList[currentMinIndex] = myList[i];
            myList[i] = currentMin;
         }//end if
       
         result[i] = myList[i];
   }//end for
   
   return result;
}//end methid
}//end class