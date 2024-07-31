package Basic;
import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int x = sc.nextInt();
        sc.close();
        boolean isPrime = true;
        if (x <= 1)
            isPrime = false;
        else {
            for (int i = 2; i<= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println("Number is prime ");
        else
            System.out.println("Not Prime");
    }

}