package Tencent;

import java.util.Scanner;

public class Main {
    public static long result(long n,long m){
        long a = n / 2;
        long b = m;
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(result(n,m));

    }
}
