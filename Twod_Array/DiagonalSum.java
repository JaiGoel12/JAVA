package Twod_Array;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n = sc.nextInt();
        int[][] arr= new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum =0;int sum2 =0 ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    sum+=arr[i][j];
                }
                if((i+j)==(m-1) && i!=j){
                    sum2+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum+sum2);
    }
}
