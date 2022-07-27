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
public class FrequencyOfCharacter {
    public static void main(String args[]){
      System.out.println("Enter a string value ::");
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();

      System.out.println("Enter a particular character ::");
      char character = sc.nextLine().charAt(0);
      int count = 0;

      for (int i=0; i<str.length(); i++){
         if(character == str.charAt(i)){
            count++;
         }
      }
      System.out.println("Frequency of the give character:: "+count);
   }
}

