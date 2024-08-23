package String;
public class Reverse {
    public static String reverseString(String input) {

        StringBuilder str= new StringBuilder(input);
        str.reverse();
        return str.toString();

    }

    public static void main(String[] args) {

        String message = "Hello World";
        String reversedMessage = reverseString(message);
        System.out.println(reversedMessage); // Output: dlroW olleH

    }
}
