package bit_manipulation;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:-");
        int a = sc.nextInt();
        System.out.println("Enter 2st number:-");
        int b = sc.nextInt();
        a =a^b;
        b =a^b;
        a =a^b;
        System.out.println("Value of a is:- "+a);
        System.out.println("Value of b is:- "+b);
    }


}
