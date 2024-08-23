package String;
public class CountVowels {

    public static int countVowels(String input) {
        int count = 0;
        String vowels="aAeEiIoOuU";
        for(char c:input.toCharArray()) {
            if(vowels.indexOf(c)!=-1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String text = "Jai Goel";
        int vowelCount = countVowels(text);
        System.out.println(vowelCount); // Output: 5
    }
}
