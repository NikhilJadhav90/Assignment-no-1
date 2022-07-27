/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

/**
 *
 * @author kanev
 */
public class MatrixTransport {
     static final int matrix_size = 4;
   public static void main (String[] args) {
      int input_matrix[][] = {
         {1, 1, 1, 1},
         {2, 2, 2, 2},
         {3, 3, 3, 3},
         {4, 4, 4, 4}
      };
      System.out.println("The matrix is defined as: \n");
      for (int i = 0; i < matrix_size; i++) {
         for (int j = 0; j < matrix_size; j++) {
            System.out.print(input_matrix[i][j] + " ");
         }
         System.out.println();
      }
      int result_matrix[][] = new int[matrix_size][matrix_size];
      for (int i = 0; i < matrix_size; i++)
         for (int j = 0; j < matrix_size; j++)
            result_matrix[i][j] = input_matrix[j][i];
      System.out.println("\nThe transpose of the matrix is: ");
      for (int i = 0; i < matrix_size; i++) {
         for (int j = 0; j < matrix_size; j++) {
            System.out.print(result_matrix[i][j] + " ");
         }
         System.out.println();
      }
   }

}
