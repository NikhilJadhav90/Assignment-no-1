
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
public class IncrementAndDecrement {
    private static Scanner sc;
	public static void main(String[] args) {
		int i, j;
		sc = new Scanner(System.in);
		System.out.println(" Please Enter two integer Value: ");
		i = sc.nextInt();
		j = sc.nextInt();
		
	    System.out.println("----JAVA INCREMENT OPERATOR EXAMPLE---- \n");
		System.out.format(" Value of i : %d \n", i); //Original Value
		System.out.format(" Value of i : %d \n", i++); // Using increment Operator
		System.out.format(" Value of i : %d \n", i); //Incremented value
		
	    System.out.println("----JAVA DECREMENT OPERATOR EXAMPLE---- \n");
		System.out.format(" Value of j : %d \n", j); //Original Value
		System.out.format(" Value of j : %d \n", j--); // Using Decrement Operator
		System.out.format(" Value of j : %d \n", j); //Decrement value
	}
}
