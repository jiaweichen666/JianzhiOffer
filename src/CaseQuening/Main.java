package CaseQuening;

import java.util.Scanner;

public class Main {
    public static String caseQuening(String s){
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        char pivot = chars[0];
        while (start < end){
            while (start < end && chars[end]>='A' && chars[end] <= 'Z' ){
                end --;
            }
            chars[start] = chars[end];
            while (start < end && chars[start] >='a' && chars[start] <='z'){
                start++;
            }
            chars[end] = chars[start];
        }
        chars[start] = pivot;
        return new String(chars);
    }
    public static String caseQue(String  s){
        return  s.replaceAll("[A-Z]", "")+ s.replaceAll("[a-z]", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(caseQue(s));
    }
}
