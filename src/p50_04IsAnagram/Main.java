package p50_04IsAnagram;

/**
 * Author:chen
 * Time:2018/4/19/10:59
 * Description:如果两个单词组成的组成letter一样，且letter书目也一样，那么这两个单词互为变位词
 * 判断两个单词是否为变位词
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1,s2));
    }
    public static boolean isAnagram(String s1,String s2){
        boolean isanagram = true;
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int[] hashmap = new int[256];
        for (int i = 0; i < chars1.length ; i++) {
            hashmap[chars1[i]] ++;
        }
        for (int i = 0; i < chars2.length; i++) {
            hashmap[chars2[i]]--;
        }
        for (int i = 0; i < hashmap.length; i++) {
            if (hashmap[i] != 0){
                isanagram = false;
                break;
            }
        }
        return isanagram;
    }
}
