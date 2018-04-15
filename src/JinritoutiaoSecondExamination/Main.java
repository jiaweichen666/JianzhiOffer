package JinritoutiaoSecondExamination;

import java.util.Scanner;

public class Main {
    public static int minT(int[] nums) {
        int T = 0;
        int len = nums.length;
        if (len == 2) {
            return nums[1] - nums[0];
        }
        int tmp = nums[1] - nums[0];
        boolean flag = false;
        int i = 2;
        while (i < len) {
            if (nums[i] - nums[i - 1] != tmp)
                break;
            i++;
        }
        if (i == len) {
            flag = true;
        }
        if (flag) {
            T = nums[len - 1] / len;
        } else
            T = nums[len - 1] - nums[0];
        return T;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[n][n];
        for (int i = 0; i < n; i++) {
            int ss = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                nums[i][j] = scanner.nextInt();
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(minT(nums[i]));

        }

    }
}
