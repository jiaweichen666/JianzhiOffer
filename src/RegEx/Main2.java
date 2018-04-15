package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    private static final String line = "cat cat cattie cat";
    private static final String line2 = "chenchenchenchen";
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\bcat\\b");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()){
            System.out.println("Start: "+matcher.start());
            System.out.println("End: " +matcher.end());
            System.out.println("______________________________");
        }
        Pattern pattern1 = Pattern.compile("chen");
        Matcher matcher1 = pattern1.matcher(line2);
        //maches要求整句匹配，LookingAt要求从第一个字符开始部分匹配
        System.out.println(matcher1.matches());
        System.out.println(matcher1.lookingAt());
        System.out.println("______________________________");
        //rePlaceFirst和replaceAll
        String output = matcher.replaceAll("dog");
        System.out.println(output);

    }
}
