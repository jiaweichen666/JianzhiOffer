package KMP;

public class EasierKMP {
    public static void main(String[] args) {
        String s = "ababababca";
        String mode = "abababca";
        System.out.println(KMP(s,mode));
    }
    public static int[] getNext(String s){
        int[] next = new int[s.length()];
        next[0] = -1;
        int i = 0,j = -1;
        while (i < s.length() - 1 ){
            if (j == -1 || s.charAt(i) == s.charAt(j)){
                ++i;
                ++j;
                next[i] = j;
            }
            else
                j = next[j];
        }
        return next;
    }
    public static int KMP(String s,String mode){
        int i = 0;
        int j = 0;
        int[] next = getNext(mode);
        while (i < s.length() && j < mode.length()){
            if (j == -1 || s.charAt(i) == mode.charAt(j)){
                i++;
                j++;
            }
            else
                j = next[j];
        }
        if (j == mode.length())
            return i - j;
        else
            return -1;
    }
}
