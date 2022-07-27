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
public class GCDUsingRecursion {
    	public static int getGCD(int a, int b) {
		if (a == 0)
			return b;
		else
			return getGCD(b % a, a);
	}

	public static void main(String[] args) {

		// scanner class declaration
		Scanner sc = new Scanner(System.in);
		// input from the user
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		// input from the user
		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();

		// Calling Recursive Function
		int GCD = getGCD(num1, num2);

		System.out.print("HCF of " + num1 + " and " + num2 + " is " + GCD);

		// closing scanner class(not compulsory, but good programming practice)
		sc.close();

	}
}
