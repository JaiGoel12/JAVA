package bit_manipulation;

public class OneOddOccuring {
    public static void main(String[] args) {
        int[] arr= {1,1,2,2,3,3,3,3,3};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            count = count^arr[i];
        }
        System.out.println(count);
    }
}
