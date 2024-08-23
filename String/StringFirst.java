package String;
public class StringFirst {
    public static void main(String[] args) {
        String str1= "Hello";
        String str2= new String("World");
        //display
        System.out.println(str1);
        System.out.println(str2);
        //concat
        //String str3 = str1.concat(str2);
        String str3 =str1+" "+str2;
        System.out.println(str3);

        System.out.println("Length of string is:-"+str3.length());
        char c = str3.charAt(7);
        System.out.println(c);
        System.out.println(str3.indexOf('o'));
        System.out.println(str3.lastIndexOf('o'));

        String sub = str3.substring(2,7);
        System.out.println(sub);

        String rep = str3.replace('o','0');
        System.out.println(rep);


    }
}
