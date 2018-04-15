package LongestCommonSequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int LongestCommonSequence(String a,String b){
        if (a.length() == 0 || b.length() == 0)
            return 0;
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        int lena = ca.length;
        int lenb = cb.length;
        int[][] lcs = new int[lena + 1][lenb + 1];
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < lena + 1; i++) {
            for (int j = 0; j < lenb + 1; j++) {
                if (i == 0 || j == 0)
                    lcs[i][j] = 0;
                else if (i > 0 && j > 0 && ca[i - 1] == cb[j - 1] ){
                    lcs[i][j] = lcs[i - 1 ][j - 1] + 1;
                    //list.add(ca[i - 1]);
                }
                else if (i > 0 && j > 0 && ca[i - 1] != cb[j - 1]){
                    if (lcs[i - 1][j] >= lcs[i][j - 1]){
                        lcs[i][j] = lcs[i - 1][j];
                        //list.add(ca[i - 1]);
                    }else {
                        lcs[i][j] = lcs[i][j - 1];
                        //list.add(ca[j - 1]);
                    }
                }
            }
        }
        System.out.println(list.toString());
        return lcs[lena][lenb];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            int slen = s.length();
            StringBuffer sb = new StringBuffer(s);
            sb.reverse();
            String rs = sb.toString();
            int lcs = LongestCommonSequence(s, rs);
            System.out.println(slen - lcs);
        }
    }
}
