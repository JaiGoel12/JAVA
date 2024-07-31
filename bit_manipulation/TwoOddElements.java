package bit_manipulation;

public class TwoOddElements {
    public static void main(String[] args) {
//        int[] arr= {1,1,2,2,3,5};
//        int num1=0,num2=0;
//        //first part
//        int xor=0;
//        for (int i = 0; i < arr.length; i++) {
//            xor=xor^arr[i];
//        }
//        System.out.println(xor);
//        //2nd part
//        int pos=0;
//        for (int i = 0; i < 32; i++) {
//            if((xor&(1<<i))>0){
//                pos=i;
//                break; //break se 1st set bit aa rhi h and without break last set bit aa rhi h
//            }
//
//        }
//        System.out.println(pos);
//
//        //3rd part
//        for (int i = 0; i < arr.length; i++) {
//            if((arr[i]&(1<<pos))>0){
//            num1=num1^arr[i];
//            }
//            else{
//                num2=num2^arr[i];
//            }
//
//        }
//        System.out.println(num1+" "+num2);


        //2nd approach to do the question

        int[] arr= {1,1,2,2,3,5};
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor=xor^arr[i];
        }
        int k= xor&(~(xor-1));

        int a=0;
        int b=0;
        for (int j = 0; j < arr.length; j++) {
            if((arr[j]&k)!=0){
                a=a^arr[j];
            }
            else{
                b=b^arr[j];
            }

        }

        System.out.println(a+"   "+ b);
    }

}
