package Twod_Array;

import java.util.Scanner;

public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the first matrix (a):");
        int a = sc.nextInt();
        System.out.println("Enter the number of columns of the first matrix (b):");
        int b = sc.nextInt();
        int[][] arr1 = new int[a][b];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows of the second matrix (c):");
        int c = sc.nextInt();
        System.out.println("Enter the number of columns of the second matrix (d):");
        int d = sc.nextInt();
        if (b != c) {
            System.out.println("Matrix multiplication is not possible. The number of columns of the first matrix must equal the number of rows of the second matrix.");
            return;
        }
        int[][] arr2 = new int[c][d];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] multi = new int[a][d];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < d; j++) {
                multi[i][j] = 0;
                for (int k = 0; k < b; k++) {
                    multi[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("The resultant matrix is:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
