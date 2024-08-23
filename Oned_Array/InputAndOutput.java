package Oned_Array;

import java.util.Arrays;
import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        //input
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        //output
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
//        for(int j : arr){
//            System.out.print(j+" ");
//        }

        //System.out.println(Arrays.toString(arr));


    }
}
