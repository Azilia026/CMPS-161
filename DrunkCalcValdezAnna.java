import java.util.Scanner;

public class DrunkCalcValdezAnna{//start class

   public static void main (String[] args){//start main

      Scanner input = new Scanner(System.in);
     
      System.out.println("S'what doya want?");
     
      System.out.println("Tell me + for additon, - for subtraction, * for multiplication, / for division, % for modulus, or ! to leave me alone:");
         String command = input.nextLine();
         
      switch(command){//begin switch
        
         case "+": //add
       
            System.out.println("S'wats yer firsst numbur *hic* to add?");
            double num1 = input.nextDouble();
            System.out.println("OooK, *hic* secoond numbur ta add?");
            double forgotenNum = input.nextDouble();
            double madeUpNum = 1+Math.random()*100;
            double answer = num1 + madeUpNum;
            System.out.printf("then yer answer iss... %.2f!", answer);
            System.out.printf(" 'cause yer first numbur was " + num1 + " and yer secomnd numbur was %.2f \n", madeUpNum);
            System.out.print("What do you mean tha second number ain’t right? I'm the calculator here! Get out!");
         
         break;
        
         case "-": //subtract
         
            System.out.println("S'wats yer firsst numbur *hic* to Subtract?");
            double numSub = input.nextDouble();
            System.out.println("OooK, *hic* secoond numbur ta subtract?");
            double forgotenNumSub = input.nextDouble();
            double madeUpNumSub = 1+Math.random()*100;
            double answerSub = numSub - madeUpNumSub;
            System.out.printf("then yer answer iss... %.2f!", answerSub);
            System.out.printf(" 'cause yer first numbur was " + numSub + " and yer secomnd numbur was %.2f \n", madeUpNumSub);
            System.out.print("What do you mean tha second number ain’t right? I'm the calculator here! Get out!");
         
         break;
        
         case "*": //multiply
         
            System.out.println("S'wats yer firsst numbur *hic* to multipy?");
            double num1Mult = input.nextDouble();
            System.out.println("OooK, *hic* secoond numbur ta mltiply?");
            double forgotenNumMult = input.nextDouble();
            double madeUpNumMult = 1+Math.random()*100;
            double answerMult = num1Mult * madeUpNumMult;
            System.out.printf("then yer answer iss... %.2f!", answerMult);
            System.out.printf(" 'cause yer first numbur was " + num1Mult + " and yer secomnd numbur was %.2f \n", madeUpNumMult);
            System.out.print("What do you mean tha second number ain’t right? I'm the calculator here! Get out!");

         
         break;
        
         case "/": //divide
         
            System.out.println("S'wats yer firsst numbur *hic* to divid?");
            double num1Div = input.nextDouble();
            System.out.println("OooK, *hic* secoond numbur ta divide?");
            double forgotenNumDiv = input.nextDouble();
            double madeUpNumDiv = 1+Math.random()*100;
            double answerDiv = num1Div / madeUpNumDiv;
            System.out.printf("then yer answer iss... %.2f!", answerDiv);
            System.out.printf(" 'cause yer first numbur was " + num1Div + " and yer secomnd numbur was %.2f \n", madeUpNumDiv);
            System.out.print("What do you mean tha second number ain’t right? I'm the calculator here! Get out!");

         
         break;
       
         case "%": //modulus
         
            System.out.println("S'wats yer firsst numbur *hic* to mod?");
            double num1Mod = input.nextDouble();
            System.out.println("OooK, *hic* secoond numbur ta mod?");
            double forgotenNumMod = input.nextDouble();
            double madeUpNumMod = 1+Math.random()*100;
            double answerMod = num1Mod % madeUpNumMod;
            System.out.printf("then yer answer iss... %.2f!", answerMod);
            System.out.printf(" 'cause yer first numbur was " + num1Mod + " and yer secomnd numbur was %.2f \n", madeUpNumMod);
            System.out.print("What do you mean tha second number ain’t right? I'm the calculator here! Get out!");

         break;
       
         case "!": //end program
         
            System.out.println("Get *hic* outta here theen");
         
         break;
       
         default: System.out.println("How'dya even get heere??! Go back an' enter a valid character!"); //incorrect input
   
   
      }// end switch
   }// end main
} //end class