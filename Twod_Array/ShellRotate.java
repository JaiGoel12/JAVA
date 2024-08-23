package Twod_Array;

import java.util.Scanner;
public class ShellRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int m =sc.nextInt();
        int[][] arr= new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        int s = sc.nextInt();
        int r= sc.nextInt();
        rotation(arr,s,r);

    }

    public static void rotation(int[][] arr, int s, int r) {
        int[] oned = fetch(arr,s);
        rotate(oned,r);
        putback(arr, oned,s);
    }

    private static void rotate(int[] oned, int r) {

    }

    private static void putback(int[][] arr, int[] oned, int s) {
        int minr=s-1;
        int minc = s-1;
        int maxr =arr.length-s;
        int maxc = arr[0].length-s;
        int size = 2*(maxr-minr+maxc-minc);
        //int[] oned  =new int[size];
        int idx = 0;

        //left wall
        for (int i = minr; i <=maxr; i++) {
            arr[i][minc]=oned[idx];
            idx++;
        }
        //bottom wall

        for (int i = minc; i <= maxc ; i++) {
            arr[maxr][i]=oned[idx];
            idx++;

        }
        //right wall
        for (int i = maxr; i >=minr ; i--) {
            arr[i][maxc]=oned[idx];
            idx++;
        }

        //top wall
        for (int i = maxc-1; i >=minc+1 ; i--) {
            arr[minr][i]=oned[idx];
            idx++;
        }
    }

    public static int[] fetch(int[][] arr,int s) {
        int minr=s-1;
        int minc = s-1;
        int maxr =arr.length-s;
        int maxc = arr[0].length-s;
        int size = 2*(maxr-minr+maxc-minc);
        int[] oned  =new int[size];
        int idx = 0;

        //left wall
        for (int i = minr; i <=maxr; i++) {
            oned[idx]=arr[i][minc];
            idx++;
        }
        //bottom wall

        for (int i = minc; i <= maxc ; i++) {
            oned[idx]=arr[maxr][i];
            idx++;

        }
        //right wall
        for (int i = maxr; i >=minr ; i--) {
            oned[idx]=arr[i][maxc];
            idx++;
        }

        //top wall
        for (int i = maxc-1; i >=minc+1 ; i--) {
            oned[idx]=arr[minr][i];
            idx++;
        }

        return oned;
    }
}
