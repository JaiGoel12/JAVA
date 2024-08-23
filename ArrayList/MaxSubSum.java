package ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MaxSubSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr);
        arr.add(12);
        arr.add(22);
        arr.add(32);
        arr.add(42);
        arr.add(52);
        System.out.println(arr);
        arr.add(1,62);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        arr.remove(Integer.valueOf(22));
        System.out.println(arr);



        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.set(1,72);
        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);

        if(!arr.contains(92))
        {
            arr.add(92);
        }
        System.out.println(arr);
    }
}
