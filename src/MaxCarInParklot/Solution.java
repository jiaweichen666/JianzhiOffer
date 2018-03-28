package MaxCarInParklot;

import java.util.*;

public class Solution {
    public int maxCar(int[][] cars) {
        int maxCarInlot = Integer.MIN_VALUE;
        int currentcar  = 0;
        List<Pair> lists = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            lists.add(new Pair(cars[i][0], true));
            lists.add(new Pair(cars[i][1], false));
        }
        Collections.sort(lists, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                int back = 0;
                if (o1.val > o2.val){
                    back = 1;
                }
                if (o1.val < o2.val){
                    back = -1;
                }
                return back;
            }
        });
        Iterator<Pair> iterator = lists.listIterator();
        while (iterator.hasNext()){
            Pair tmp = iterator.next();
            if (tmp.isStart){
                currentcar++;
            }else{
                currentcar--;
            }
            maxCarInlot = Integer.max(currentcar,maxCarInlot);
        }
        return maxCarInlot;
    }

}
