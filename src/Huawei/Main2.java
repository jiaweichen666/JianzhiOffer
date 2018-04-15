package Huawei;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        if (s1 == null || s2 == null)
            return;
        if (Integer.valueOf(s1) == 0 || Integer.valueOf(s2) == 0)
            System.out.println(0);
        else {
            long a = Long.valueOf(s1);
            char[] b = s2.toCharArray();
            long[] tmps = new long[b.length];
            int blen = b.length;
            for (int i = 0; i < blen; i++) {
                int multiNum = (int) Math.pow(10, i);
                int mb = b[blen - 1 - i] - '0';
                tmps[i] = a * mb * multiNum;
            }
            long re = 0;
            for (int i = 0; i < tmps.length; i++) {
                re = re + tmps[i];
            }
            System.out.println(re);
        }
    }
}
