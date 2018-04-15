package HuaweiSImulate;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] scores = new int[N];
            for (int i = 0; i < N; i++) {
                scores[i] = scanner.nextInt();
                System.out.println(scores[i]);
            }
            for (int i = 0; i < M; i++) {
                String C = scanner.next();
                int A = scanner.nextInt();
                int B = scanner.nextInt();
                process(C,A,B,scores);
            }

        }
    }
    public static void process(String C,int A ,int B,int[] scores){
        if (C.equals("Q")){
            int max = Integer.MIN_VALUE;
            int start = A;
            int end = B;
            if (A > B){
                start = B;
                end = A;
            }
            for (int j = start - 1; j < end ; j++) {
                if (scores[j] > max){
                    max = scores[j];
                }
            }
            System.out.println(max);
        }else {
            scores[A - 1] = B;
        }

    }
}
