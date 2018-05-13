package BracketMatching;

/**
 * Description:括号匹配问题
 * tips：使用numbers变量记录，遇到左括号+1，遇到有括号-1，若遍历过程中num < 0 ,返回false
 * 若遍历到最后number == 0，返回true，否则返回false
 */
public class Main {
    public static void main(String[] args) {
        String s = "((((())))()";
        System.out.println(isMatched(s));
    }
    public static boolean isMatched(String s){
        char[] chars = s.toCharArray();
        int nums = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(')
                nums++;
            else if (chars[i] == ')')
                nums--;
            if (nums < 0)
                return false;
        }
        if (nums == 0)
            return true;
        return false;
    }
}
