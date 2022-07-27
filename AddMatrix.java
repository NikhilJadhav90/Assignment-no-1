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
public class AddMatrix {
     public static void main(String[] args) {
      int matrix_size = 3;
      int[][] input_matrix_1 = {
         {2, 3, 4},
         {5, 2, 3},
         {4, 6, 9}
      };
      System.out.println("The first matrix is defined as: \n");
      for (int i = 0; i < matrix_size; i++) {
         for (int j = 0; j < matrix_size; j++) {
            System.out.print(input_matrix_1[i][j] + " ");
         }
         System.out.println();
      }
      int[][] input_matrix_2 = {
         {1, 5, 3},
         {5, 6, 3},
         {8, 1, 5}
      };
      System.out.println("The second matrix is defined as: \n");
      for (int i = 0; i < matrix_size; i++) {
         for (int j = 0; j < matrix_size; j++) {
            System.out.print(input_matrix_2[i][j] + " ");
         }
         System.out.println();
      }
      int[][] resultant_matrix = new int[matrix_size][matrix_size];
      for(int i = 0; i < matrix_size; i++) {
         for (int j = 0; j < matrix_size; j++) {
            resultant_matrix[i][j] = input_matrix_1[i][j] + input_matrix_2[i][j];
         }
      }
      System.out.println("The sum of the two matrices is: ");
      for(int[] row : resultant_matrix) {
         for (int column : row) {
            System.out.print(column + " ");
         }
         System.out.println();
      }
}
}