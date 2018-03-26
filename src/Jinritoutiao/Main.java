package Jinritoutiao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lenm = 1;
        int lens = 1;
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        Solution solution = new Solution();
        solution.helper(n,0,lens,lenm,false);
    }
}
