package p45SortArrayForMinNumber;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,32,321};
        printMinNum(nums);
    }
    public static void printMinNum(int[] nums){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                sb1.append(o1).append(o2);
                sb2.append(o2).append(o1);
                return sb1.toString().compareTo(sb2.toString());
            }
        });
        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }
}