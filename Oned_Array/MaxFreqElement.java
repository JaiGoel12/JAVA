package Oned_Array;

import java.util.Scanner;

public class MaxFreqElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        int mf= 0;
        int mfe= -1;
        for (int i = 0; i < arr.length; i++) {
            int count  =0 ;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count>mf){
                mf= count;
                mfe = arr[i];
            }

        }
        System.out.println(mfe);
        System.out.println(mf);

    }
}
