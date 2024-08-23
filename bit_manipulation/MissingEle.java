package bit_manipulation;
public class MissingEle {
    public static void main(String[] args) {
//        int[] arr = {4, 1, 3, 5};
//        int xorAll = 0;
//        int xorNum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            xorAll = xorAll ^ arr[i];
//        }
//        for (int i = 1; i <= arr.length + 1; i++) {
//            xorNum = xorNum ^ i;
//        }
//        int result = xorAll ^ xorNum;
//        System.out.println(result);


        //SECOND APPROACH
        int[] arr= {2,3,1,5};
        int l = arr.length +1;
        int elements= l*(l+1)/2;
        System.out.println(elements);
        int x= arr.length;
        int y = x*(x+1)/2;
        System.out.println(y);
        int miss= elements-y;
        System.out.println("Missing element is:- "+miss);
    }
}

