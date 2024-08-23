package Basic;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("enter a number:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
