import java.util.Scanner;

public class Toeplitz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]= sc.nextInt();
            }
        }

        boolean isToeplitz = true;
        for (int i = 1; i < arr.length; i++) {  //i<n && isToeplitz
            for (int j = 1; j < arr[0].length; j++) {  //j<m
                if(arr[i][j]!=arr[i-1][j-1]){
                    isToeplitz= false;
                    break;
                }
            }

        }

        if(isToeplitz){
            System.out.println("Matrix is a toepltiz matrix");
        }
        else{
            System.out.println("Matrix is not a toeplitz matrix");
        }




    }
}
