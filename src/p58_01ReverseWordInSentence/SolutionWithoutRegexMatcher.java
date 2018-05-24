package p58_01ReverseWordInSentence;

public class SolutionWithoutRegexMatcher {
    public static void main(String[] args) {
        String s = "I am a student.";
        System.out.println(ReverseSentence(s));

    }
    public static String ReverseSentence(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = 0;
        int lastSpaceIndex = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' '){
                start = lastSpaceIndex + 1;
                end = i - 1;
                lastSpaceIndex = i;
                chars = rotate(chars,start,end);
            }
        }
        chars = rotate(chars,lastSpaceIndex + 1,chars.length - 1);
        chars = rotate(chars,0,chars.length  - 1);
        return String.valueOf(chars);
    }
    public static char[] rotate(char[] chars,int start,int end){
        if (chars == null || start >= end)
            return chars;
        while(start < end){
            char tmp = chars[start];
            chars [start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
        return chars;
    }
}
