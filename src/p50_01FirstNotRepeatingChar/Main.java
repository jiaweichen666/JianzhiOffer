package p50_01FirstNotRepeatingChar;

/**
 * Author:chen
 * Time:2018/4/19 10:17
 * Description:找出字符串中第一个不重复的字符
 */
public class Main {
    public static void main(String[] args) {
        String s = "adaccbeff";
        System.out.println(firtNotRepeatedChar(s));
    }
    public static char firtNotRepeatedChar(String s){
        char[] chars = s.toCharArray();
        int[] hashMap = new int[256];
        char firtchar = 0;
        for (int i = 0; i < chars.length; i++) {
            hashMap[chars[i]]++;
        }
        for (int i = 0; i < chars.length ; i++) {//注意第二次扫描时还是根据chars的顺序扫
            if (hashMap[chars[i]] == 1) {
                firtchar = chars[i];
                break;
            }
        }
        return firtchar;
    }
}
