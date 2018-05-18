package p62LastNumberInCircle;

import java.util.LinkedList;
import java.util.List;

/**
 * Description:求约瑟夫环中的最后一数字
 * Tips：用队列来模拟循环队列，当遍历到current == circle.size时说明已经遍历了一圈，current重新指向队头
 */
public class CircularchainSimulation {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        System.out.println(getLastValueInJosephuseCircle(list,3));
    }
    public static int getLastValueInJosephuseCircle(List<Integer> circle,int k){
        if (circle == null || k < 0)
            return -1;
        int current = 0;
        while (circle.size() != 1){
            for (int i = 1; i < k; i++) {
                current++;
                if (current == circle.size())//转向对头
                    current = 0;
            }
            circle.remove(current);
            if (current == circle.size())//转向对头
                current = 0;
        }
        return circle.get(0);
    }
}