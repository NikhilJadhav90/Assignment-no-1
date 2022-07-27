/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.util.Scanner;

/**
 *
 * @author kanev
 */
public class reverse {
    public static void main(String[] args) {
      String my_input, my_result;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.print("Enter the sentence : ");
      my_input = my_scanner.nextLine();
      my_result = reverseString(my_input);
      System.out.println("The reversed input is: " + my_result);
   }
   public static String reverseString(String my_input) {
      if (my_input.isEmpty())
        return my_input;
      return reverseString(my_input.substring(1)) + my_input.charAt(0);
   }
}
