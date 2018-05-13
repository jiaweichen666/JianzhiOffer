package p48LongestSubstringWithoutDup;

/**
 * 动态规划求最长不重复子序列的长度
 **/
public class Main {
    public static void main(String[] args) {
        String s = "arabcacfrgehzxmn";
        System.out.println(longestSubStringWithoutDup(s));

    }
    public  static int longestSubStringWithoutDup(String s){
        int [] indexes = new int[26];
        int curLen = 0;//记载着以当前iindex处结尾的字符串所能向左延伸到的最长不重复子字符串的长度
        int maxLen = 0;//记录着所有字符结尾的字符串中的最大的不重复子字符串的长度
        for (int i = 0; i < s.length(); i++) {
            int prevIndex = indexes[s.charAt(i) - 'a'];
            if (prevIndex < 0 || i - prevIndex > curLen )//没出现过或者不在f（i - 1）中
                curLen++;
            else {//d <= curlen，说明了当前字符在f（i - 1）的子字符串中出现过
                if (curLen > maxLen)
                    maxLen = curLen;
                curLen = i - prevIndex;
            }
            indexes[s.charAt(i) - 'a'] = i;
        }
        if (curLen > maxLen)
            maxLen = curLen;
        return maxLen;
    }
}
