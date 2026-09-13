

package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author Shady
 */
public class Calculator {
public static int Answer;
    public static void main(String[] args) {
       
        do{
          System.out.println("=================================");
        System.out.println("     WELCOME TO MY CALCULATOR!");
          System.out.println("=================================");
          
        // introduced this to ask the user question 
        Scanner Shady = new Scanner(System.in);
        
        System.out.println("Press 1 to use the Calculator");
        System.out.println("Press 2 to see history");
         System.out.println("Press any number to exit");
          System.out.print("Input: ");
         Answer = Shady.nextInt();
         
        if (Answer == 1){
            questions.Cash();
        }else if (Answer == 2){
            seeHistory.Money();
           
        }else {
             System.exit(0);
        }
    }while(Answer != 0);
    }      
}
       


