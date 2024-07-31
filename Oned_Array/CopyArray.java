package Oned_Array;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] origiarray = new int[n];
        for (int i = 0; i < n; i++) {
            origiarray[i]= sc.nextInt();
        }
        int[] dupliarray = new int[n];
        System.arraycopy(origiarray,0,dupliarray,0,n);

        for (int i = 0; i < n; i++) {
            System.out.print(origiarray[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(dupliarray[i]+" ");
        }


    }
}
