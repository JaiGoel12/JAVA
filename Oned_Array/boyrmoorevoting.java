package Oned_Array;

public class boyrmoorevoting {
    public static void main(String[] args) {
        int [] arr = {3,3,4,2,4,4,2,4,4};
        int x = arr[0];
        int count = 0;

        for(int i = 0;i<arr.length;i++){
            if(count == 0){
                x=arr[i];
                count =1;
            }
            else if(x==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(x + " " + count);

        int freq=0;
        for(int ele:arr){
            if(x==ele){
                freq++;
            }
        }
        if(freq>arr.length/2){
            System.out.println(x+" is the majority element");
        }
        else{
            System.out.println("No majority element");
        }
    }
}
