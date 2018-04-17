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
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int prevIndex = indexes[s.charAt(i) - 'a'];
            if (indexes[s.charAt(i) - 'a'] < 0 || i - prevIndex > maxLen )
                maxLen++;
            else {
                maxLen = i - prevIndex;
            }
            indexes[s.charAt(i) - 'a'] = i;
        }
        return maxLen;
    }
}
