package p58_01ReverseWordInSentence;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author:chen
 * Time:2018/4/27/12:55
 * Description:翻转字符串，但是单词的内部顺序不能改变
 * tips:matcher.start()匹配的是匹配单词的头，matcher.end()匹配的是匹配单词的尾部的后一位
 */
public class Main {
    public static void main(String[] args) {
        String s = "I am a student.";
        System.out.println(ReverseString(s));

    }
    public static String ReverseString(String s){
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        s = CoreReverse(s,start,end);
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(s);
        int subStart = 0;
        int subEnd = 0;
        int lastMatchIndex = -1;
        while (matcher.find()){
            int nowMatchIndex = matcher.start();
            subStart = lastMatchIndex + 1;
            subEnd = nowMatchIndex - 1;
            lastMatchIndex = nowMatchIndex;
            s = CoreReverse(s,subStart,subEnd);
        }
        return s;
    }
    public static String CoreReverse(String s,int start,int end){
        char[] chars = s.toCharArray();
        while (start < end){
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
        return String.valueOf(chars);
    }
}
