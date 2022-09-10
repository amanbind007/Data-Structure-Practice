package JavaCollections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;


public class Sorting_ArrayList_in_Asc_Desc_Order{
    public static void main(String[] args) {
        int nums[] = {21,56,44,12,32,64,11,19,88,90,44,99,31,59,16,72};
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
        Arrays.sort(nums);

        System.out.println(nums.length);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println(nums.toString());
        List<Integer> num = new ArrayList<>();
        num.add(21);
        num.add(56);
        num.add(44);
        num.add(12);
        num.add(32);
        num.add(64);
        num.add(11);
        num.add(19);
        num.add(88);
        num.add(90);
        num.add(44);
        num.add(99);
        num.add(31);
        num.add(59);
        num.add(16);
        num.add(79);

        //ascending order
        Collections.sort(num);
        System.out.println(num);

        //descending order
        Collections.reverse(num);
        System.out.println(num);


    
    }
}

