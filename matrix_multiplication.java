//Write a java program to take two matrix from the user and print multiplication of the matrix

import java.util.Scanner;

class matrix_multiplication {
    public static void main(String[] args) {
        int r1, r2, c1, c2, i, j, k, sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number  of rows of matrix1");
        r1 = sc.nextInt();

        System.out.println("Enter the number columns of matrix 1");
        c1 = sc.nextInt();
        System.out.println("Enter the number of rows of matrix2");
        r2 = sc.nextInt();

        System.out.println("Enter the number of columns of matrix 2");
        c2 = sc.nextInt();
        //If matrix multiplication is possible
        if (c1 == r2) {

            int[][] mat1 = new int[r1][c1];
            int[][] mat2 = new int[r2][c2];
            int[][] res = new int[r1][c2];

            System.out.println("Enter the elements of matrix1");

            for (i = 0; i < r1; i++) {

                for (j = 0; j < c1; j++)
                    mat1[i][j] = sc.nextInt();

            }
            System.out.println("Enter the elements of matrix2");

            for (i = 0; i < r2; i++) {

                for (j = 0; j < c2; j++)
                    mat2[i][j] = sc.nextInt();

            }
            //Printing matrix which is input by user
            System.out.println("\nFirst matrix ");
            for (i = 0; i < r1; i++) {

                for (j = 0; j < c1; j++)
                    System.out.print(mat1[i][j] + " ");
                System.out.println();

            }
            System.out.println("\nSecond matrix ");
            for (i = 0; i < r2; i++) {

                for (j = 0; j < c2; j++)
                    System.out.print(mat2[i][j] + " ");
                System.out.println();

            }

            //Calculating the matrix multiplication
            for (i = 0; i < r1; i++) {

                for (j = 0; j < c2; j++) {
                    sum = 0;
                    for (k = 0; k < c1; k++) {
                        sum += mat1[i][k] * mat2[k][j];

                    }
                    res[i][j] = sum;
                }
            }
            //Printing the matrix multiplication result
            System.out.println("\noutput matrix:-");
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c2; j++)
                    System.out.print(res[i][j] + " ");

                System.out.println();
            }
        }
        //If matrix multiplication is not possible
        else
            System.out.print("multiplication does not exist ");
    }

}