package Twod_Array;

import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the values of rows:-");
        int m=sc.nextInt();
        System.out.println("Enter the values of column:-");
        int n= sc.nextInt();
        System.out.println("Enter the elements of the matrix:- ");
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
