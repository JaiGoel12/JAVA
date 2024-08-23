package Basic;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        System.out.println("Enter the year:- ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float avg = (a + b + c) / 3;
        System.out.println(avg);
    }
}
