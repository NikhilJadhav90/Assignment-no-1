
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kanev
 */
public class Palindrome {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      System.out.println("Enter an input number");
      int num = in.nextInt();

      // Assign number in temp
      int temp = num;
  
      int rev = 0, digit;
 
      // Logic to reverse a number
      while (temp > 0) {
 
        digit = temp % 10;
        rev = rev * 10 + digit;
        temp = temp / 10;
      }

      /*
       * If original and reverse of a number 
       * is equal then it's a palindrome number.
       */
       if (rev == num) {
         System.out.println(num + " is palindrome");
       } else {
         System.out.println(num + " is not a palindrome");
       }
   }
}
