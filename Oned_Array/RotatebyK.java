package Oned_Array;
import java.util.Scanner;

public class RotatebyK {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int d=sc.nextInt();
            rotate(arr, d);
            //System.out.println(Arrays.toString(arr));
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        private static void rotate(int[] arr, int d) {
            reverse(arr, 0, d - 1);
            reverse(arr, d, arr.length - 1);
            reverse(arr, 0, arr.length - 1);
        }
        public static void reverse(int[] arr, int i, int j) {
            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
}
