package p50_02FirstCharacterInStream;
/**
 * Description:请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * 输出描述:如果当前字符流没有存在出现一次的字符，返回#字符。
 * Tips:使用一个数组记录每个字符出现的次数，使用一个list，在字符第一次被读入时加入list
 * 查找当前读入的字符流中第一个不重复的字符时，直接从list队列头部取元素使用辅助数组判断是否只出现了一次
 * 如果是直接返回，如果不是取下一个元素继续判断，若一直判断到list为空还未找到，则直接返回‘#’
 */

import java.util.LinkedList;

public class Solution {
    //Insert one char from stringstream
    private int[] flags;
    private LinkedList<Character> list;
    public Solution(){
        flags = new int[65535];
        list = new LinkedList<>();
    }
    public void Insert(char ch)
    {
        flags[ch]++;
        if (flags[ch] == 1)
            list.addLast(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        while (!list.isEmpty()){
            char cur = list.getFirst();
            if (flags[cur] == 1)
                return cur;
            else
                list.removeFirst();
        }
        return '#';
    }
}