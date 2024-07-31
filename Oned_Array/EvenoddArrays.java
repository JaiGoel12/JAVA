package Oned_Array;
import java.util.*;
public class EvenoddArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int[] arr= new int[x];
        for (int i = 0; i < x; i++) {
            arr[i]=sc.nextInt();
        }
        //int[] arr={1,2,3,4,5,6,-7,-8,-9};
        int n =arr.length;
        int[] temp = new int[n];
        int i =0, j = n-1;
        for (int k = 0; k < n; k++) {
            if(arr[k]%2!=0){
                temp[i++]=arr[k];
            }
            else{
                temp[j--]=arr[k];
            }
        }

        for(int k = 0; k < n; k++) {
            arr[k]=temp[k];
        }
        Arrays.sort(arr,0,i);
        Arrays.sort(arr,i,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
