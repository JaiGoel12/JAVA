package Oned_Array;
import java.util.Scanner;

public class AskingUserToRot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of positions to rotate: ");
        int d = sc.nextInt();
        System.out.print("Enter the direction of rotation (L for left, R for right): ");
        char direction = sc.next().charAt(0);
        rotate(arr, d, direction);
        System.out.println("Array after rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void rotate(int[] arr, int d, char direction) {
        int n = arr.length;
        if (direction == 'R' || direction == 'r') {
            d = d % n;  // Adjust for values larger than array size
            reverse(arr, 0, d - 1);
            reverse(arr, d, n - 1);
            reverse(arr, 0, n - 1);
        } else if (direction == 'L' || direction == 'l') {
            d = d % n;  // Adjust for values larger than array size
            reverse(arr, 0, n - d - 1);
            reverse(arr, n - d, n - 1);
            reverse(arr, 0, n - 1);
        } else {
            System.out.println("Invalid direction! Use 'L' for left or 'R' for right.");
        }
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
