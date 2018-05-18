package p61IsContinuesCards;
/**
 * Description:给出一组数，判断是都是顺子，0可以当做任何牌
 * Tips：先排序数组然后查找数组中的0，在查找数组中的gap数。若0的个数<gap数则不是顺子
 *       若数组中出现了对子，则不是顺子
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] cards = {0,2,3,4,6};
        System.out.println(IsContinuesCards(cards));
    }
    public static boolean IsContinuesCards(int[] cards){
        if (cards.length == 1)
            return true;
        if (cards.length <= 0)
            return false;
        int ZeroNums = 0;
        int GapNums = 0;
        boolean isContinues = true;
        Arrays.sort(cards);
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == 0)
                ZeroNums++;
            if (cards[i] > 0)
                break;
        }
        int smallIndex = ZeroNums;
        int bigIndex = smallIndex + 1;
        while (bigIndex < cards.length){
            if (cards[smallIndex] == cards[bigIndex]) {
                isContinues = false;
                break;
            }
            else if (cards[bigIndex] - cards[smallIndex] != 1) {
                GapNums = cards[bigIndex] - cards[smallIndex] - 1;
                smallIndex = bigIndex;
                bigIndex++;
            }else {
                smallIndex = bigIndex;
                bigIndex++;
            }
        }
        if (GapNums > ZeroNums)
            isContinues = false;
        return isContinues;
    }
}
