package p50_02DeleteCharFromString1InString2;

/**
 * Description:删除第一个字符串中的在第二个字符串中出现的字符
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "We are students.";
        String s2 = "aeiou";
        char[] chars = s2.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
         s1 = s1.replaceAll(String.valueOf(chars[i]),"");
        }
        System.out.println(s1);
    }

}
