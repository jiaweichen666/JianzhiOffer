package Huawei;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Character,Integer> hashMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s == null ) return;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (hashMap.containsKey(chars[i])){
                int value = hashMap.get(chars[i]);
                hashMap.replace(chars[i],++value);
            }else{
                hashMap.put(chars[i],1);
            }
        }
        int[] nums = new int[hashMap.size()];
        char[] cs = new char[hashMap.size()];
        int m = 0;
        int maxlen = -4;
        while (!hashMap.isEmpty()){
            Iterator<Map.Entry<Character,Integer>> iterator = hashMap.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry entry = iterator.next();
                char tmp =(char) entry.getKey();
                System.out.print(tmp);
                int time = (int)entry.getValue();
                if (time == 1){
                    iterator.remove();
                }else {
                    hashMap.replace(tmp,--time);
                }
            }
        }
        /*while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            nums[m] = (int) entry.getValue();
            if (nums[m] > maxlen)
                maxlen = nums[m];
            cs[m++] = (char) entry.getKey();
        }
        for (int j = 0; j < maxlen; j++) {
        for (int i = 0; i < hashMap.size(); i++) {
            if (nums[i] > 0){
                System.out.print(cs[i]);
                nums[i]--;
            }
          }
        }*/
    }
}
