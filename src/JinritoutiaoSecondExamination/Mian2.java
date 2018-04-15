package JinritoutiaoSecondExamination;

import java.util.Scanner;

public class Mian2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int len = scanner.nextInt();
        int m = 0;
        while (m++ < len) {
            int[] matrix = new int[4];
            for (int i = 0; i < 4; i++) {
                matrix[i] = scanner.nextInt();
            }
            System.out.println(maxStep(s, matrix));
        }
    }
    public static int maxStep(String s,int [] nums){
        int N = nums[0];
        int M = nums[1];
        char[] chars = s.toCharArray();
        int charLen = chars.length;
        int step = 0;
        int x = nums[2];
        int y = nums[3];
        for (int i = 0; i < charLen; i++) {
            step++;
            boolean flag = true;
            switch (chars[i]){
                case 'u':
                    x = x - 1;
                    if (x < 1)
                        flag = false;
                    break;
                case 'd':
                    x = x + 1;
                    if (x > N)
                        flag = false;
                    break;
                case 'l':
                    y = y - 1;
                    if (y < 1)
                        flag = false;
                    break;
                case 'r':
                    y = y + 1;
                    if ( y > M)
                        flag = false;
                    break;
            }
            if (!flag)
                break;
        }
        return step;
    }
}
