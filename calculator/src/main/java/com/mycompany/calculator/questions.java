
package com.mycompany.calculator;

/**
 *
 * @author Shady
 */

import java.util.Scanner;
import java.util.ArrayList;
public class questions {
    public static ArrayList<String> History = new ArrayList<>();
    public static void Cash(){
       
         Scanner Shady = new Scanner(System.in);
         double result = 0;
         
     if (Calculator.Answer == 1) {
        // the first question
         System.out.print("Enter a number: ");
         double firstNum = Shady.nextDouble();
         Shady.nextLine();
         
         // here is where you pick a operator 
         System.out.print("Enter a symbol: ");
         String operator  = Shady.nextLine();
         
         
         //the second question
          System.out.print("Enter a number: ");
         double secondNum = Shady.nextDouble();
        
         if (operator.equals("+"))
         {
              
             result = firstNum + secondNum;
             String calculation = firstNum + " + " + secondNum +"="+ result; // turning a int into a string
            System.out.println( firstNum + " + " + secondNum );
             System.out.print(result);
              History.add(calculation);
       System.out.println("");
         } 
         else if (operator.equals("-"))
         {
              System.out.print(firstNum + " - " + secondNum);
               System.out.println("");

              result = firstNum - secondNum;
               String calculation = firstNum + " - " + secondNum +"="+ result;
                System.out.print(result);
                History.add(calculation);
       System.out.println("");
                     }
        else if (operator.equals("/"))
         {
             if (secondNum == 0)
             {
                 System.out.print("Error, you can't divide a number by 0");
             }else{
                  System.out.print(firstNum + " / " + secondNum);
               System.out.println("");
              result = firstNum/secondNum;
               String calculation = firstNum + " / " + secondNum +"="+ result;
                History.add(calculation);
                 System.out.print(result);
       System.out.println("");
             }
            
         }
        else if (operator.equals("*"))
         {
              System.out.print(firstNum + " * " + secondNum);
               System.out.println("");
               result = firstNum*secondNum;
            String calculation = firstNum + " * " + secondNum +"="+ result;
             History.add(calculation);
              System.out.print(result);
              
              
       System.out.println("");
         }else {
         System.out.print("Error, that operator is not in the system");
          
       System.out.println("");
         
        }
        
    }
       
       
}
    
}
