package Oned_Array;
import java.util.*;
public class MaxNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        //1st approach
        // Arrays.sort(arr);
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        //System.out.println(arr[arr.length-1]);

        //2nd approach
        //int maxval= Arrays.stream(arr).max().getAsInt();
        //System.out.println(maxval);

        //3rd approach

        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max:"+max);
        //calculate second max
        int secondmax=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>secondmax && arr[i]!=max){
                secondmax=arr[i];
            }

        }
        System.out.println("secondmax:"+secondmax);
    }
}
