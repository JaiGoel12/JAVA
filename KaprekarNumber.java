import java.util.*;
public class KaprekarNumber {
    public static void checkKaprekarNumber(int k){
        if(k == 1){
            return;
        }
        //count the number of digits in a number
        int count = 0;
        int sq = k * k;
        while(sq>0){
            count++;
            sq=sq/10;
        }
        sq=k*k;
        for(int i=0;i<count;i++){
            int powTen = (int)Math.pow(10, i);
            if(powTen==k){
                continue;
            }
            int sum = sq / powTen + sq % powTen;
            if (sum == k){
                System.out.println(sq / powTen + " " + sq % powTen);
            }
        }
    }

    public static void main(String[] args) {
        /*You are required to write a Java program that determines whether a given number is a Kaprekar number. A Kaprekar number for a given base is a non-negative integer, the representation of whose square in that base can be split into two parts that add up to the original number.
        Your task is to implement a program that reads an integer input, calculates its square, and checks if the original number can be obtained by splitting the square into two parts and summing them.  */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        checkKaprekarNumber(number);
        sc.close();

    }
}

