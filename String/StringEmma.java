package String;
public class StringEmma {
    public static boolean isPalindrome(String input) {

        int s=0;
        int e=input.length()-1;
        while(s<e)
        {
            if(input.charAt(s)!=input.charAt(e))
                return false;
            s++;
            e--;
        }
        return true;
    }
    public static void main(String[] args) {

        String word = "radar";

        boolean result = isPalindrome(word);

        System.out.println(result);

    }
}