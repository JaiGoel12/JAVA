package Oned_Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int k = 6;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k){
                System.out.println("Element found at index:- "+i);

            }

        }

    }
}
