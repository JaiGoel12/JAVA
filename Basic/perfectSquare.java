package Basic;

import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sqrt =Math.sqrt(n);
        if(sqrt * sqrt == n){
            System.out.println(n+ " is a perfect square");
        }
        else System.out.println(n+" is not a perfect square");

    }
}
