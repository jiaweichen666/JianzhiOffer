package p58_02LeftRotateString;

/**
 * Author:chen
 * Time:2018/4/27/13:30
 * Description:左旋字符串，将指定index之后的字符串都左旋到左半边
 */
public class Main {
    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(leftRotate(s,1));
    }
    public static String ReverseString(String s,int start,int end){
        char[] chars = s.toCharArray();
        if (start < 0 || end > chars.length - 1)
            return s;
        while (start < end){
            char tmp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = tmp;
        }
        return String.valueOf(chars);
    }
    public  static String leftRotate(String s,int index){
        if (index < 0 || index > s.length())
            return s;
        s = ReverseString(s,0,index);
        s = ReverseString(s,index + 1,s.length() - 1);
        s = ReverseString(s,0,s.length() - 1);
        return s;
    }
}
