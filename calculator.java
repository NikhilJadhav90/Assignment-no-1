/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenum;

import java.util.Scanner;

/**
 *
 * @author kanev
 */
public class calculator {
   public static void main(String[] args) {
      char operator;
      Double my_input_1, my_input_2, my_result;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.println("Enter the first number");
      my_input_1 = my_scanner.nextDouble();
      System.out.println("Enter the second number");
      my_input_2 = my_scanner.nextDouble();
      System.out.println("Enter any of the following operator: +, -, *, /, %");
      operator = my_scanner.next().charAt(0);
      switch (operator) {
         case '+':
            my_result = my_input_1 + my_input_2;
            System.out.println(my_input_1 + " + " + my_input_2 + " = " + my_result);
            break;
         case '-':
            my_result = my_input_1 - my_input_2;
            System.out.println(my_input_1 + " - " + my_input_2 + " = " + my_result);
            break;
         case '*':
            my_result = my_input_1 * my_input_2;
            System.out.println(my_input_1 + " * " + my_input_2 + " = " + my_result);
            break;
         case '/':
            my_result = my_input_1 / my_input_2;
            System.out.println(my_input_1 + " / " + my_input_2 + " = " + my_result);
            break;
         case '%':
            my_result = my_input_1 % my_input_2;
            System.out.println(my_input_1 + " % " + my_input_2 + " = " + my_result);
            break;
         default:
            System.out.println("The operator you have selected is invalid");
            break;
      }
   }
}
