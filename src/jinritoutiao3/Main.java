package jinritoutiao3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        String line;
        while (!"}".equals(line = scanner.nextLine())){
            s.append(line + "\r\n");
        }
        String ss = s.toString();
        System.out.println(ss);
        System.out.println(getNum(ss));
    }
    public static int getNum(String s){
        Pattern pattern1 = Pattern.compile("//.*//|/\\*.*\\*/");
        Pattern pattern2 = Pattern.compile("\"/.*/\"");
        Matcher matcher1 = pattern1.matcher(s);
        Matcher matcher2 = pattern2.matcher(s);
        int count1 = 0;
        int count2 = 0;
        while (matcher1.find()){
            count1++;
        }
        System.out.println(count1);
        while (matcher2.find()){
            count2++;
        }
        System.out.println(count2);
        return count1 - count2;
    }
}
