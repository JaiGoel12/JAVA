package String;

public class jaiStringBasic {
    public static void main(String[] args) {
        String name1= "jai";
        String name2 = "jai";
//TO COMPARE
        //1 s1>s2 returns any postive value
        //2 s1==s2 returns 0
        //3 s1<s2 returns any negative value

//        if(name1.compareTo(name2)==0){
//            System.out.println("The Strings ar equal");
//        }
//        else{
//            System.out.println("Strings are not equal");
//        }


        //BY SUBSTRING

        String sentence="tonystark";
        String name = sentence.substring(5,sentence.length());
        System.out.println(name);


    }
}
