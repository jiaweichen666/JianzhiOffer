package Tencent;

import java.util.Scanner;

public class Main2 {
    public static int helper(int size,int aSize,int bSize,int aAmount,int bAmount ){
        if (aSize + bSize == size)
            return aAmount * bAmount;
        int [] a = new int[aAmount];
        int [] b = new int[bAmount];
        for (int i = 0; i < aAmount; i++) {
            a[i] = aSize;
        }
        for (int i = 0; i < bAmount; i++) {
            b[i] = bSize;
        }
        int[][] count = new int[aAmount + 1][bAmount + 1];
        for (int i = 0; i < aSize + 1; i++) {
            for (int j = 0; j <bSize + 1 ; j++) {
                if (i == 0 || j== 0 && aSize!= size && bSize != size)
                    count[i][j] = 0;
                else if (i > 0 && j > 0 && (a[i - 1]+b[i - 1])==size)
                    count[i][j] = (1 + count[i][j - 1]) + i - 1;
            }
        }
        return count[aAmount][bAmount];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int sizea = scanner.nextInt();
        int aAmount = scanner.nextInt();
        int sizeb = scanner.nextInt();
        int bAmount = scanner.nextInt();
        System.out.println(helper(size,sizea,aAmount,sizeb,bAmount));
    }
}
