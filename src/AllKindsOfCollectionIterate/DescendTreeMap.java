package AllKindsOfCollectionIterate;

import java.util.*;

public class DescendTreeMap {
    public static void main(String[] args) {
        /*TreeMap<Integer,String> treeMap = new TreeMap<>();
        NavigableMap<Integer,String> DescendingtreeMap = treeMap.descendingMap();
        for (int i = 0; i <10 ; i++) {
            DescendingtreeMap.putIfAbsent(i,i+"");
        }
        Iterator<Map.Entry<Integer,String>> iterator = DescendingtreeMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = iterator.next();
            int key =(int) entry.getKey();
            System.out.println(key);
        }*/
        //第二种实现方式
        TreeMap<Integer,String> treeMap1 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < 10; i++) {
            treeMap1.putIfAbsent(i,i+" ");
        }
        Iterator<Map.Entry<Integer,String>> iterator1 = treeMap1.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry entry = iterator1.next();
            System.out.println((int)entry.getKey());
        }
    }
}
