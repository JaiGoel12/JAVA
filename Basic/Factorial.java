package Basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number:- ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("invalid input");
        }
        else {
            int c=1;
            for (int i = 1; i <= n; i++) {
                c=c*i;
            }
            System.out.println(c);
        }

    }
}
