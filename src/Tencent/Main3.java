package Tencent;

import java.util.Scanner;

public class Main3 {
    public static void work(int machineNum, int workNum,int [][] machines, int [][] works){
        if (machineNum <= 0 || workNum <= 0)
            System.out.println(0);
        boolean [] machineflag = new boolean[machineNum];
        boolean [] workflag = new boolean[workNum];
        for (int i = 0; i < machineNum; i++) {
            int time = machines[i][0];
            int priority = machines[i][1];
            int maxMoney = Integer.MIN_VALUE;
            for (int j = 0; j < workNum; j++) {
                if (works[j][0] > time || works[j][1] > priority)
                    continue;
                int tmp = works[j][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}
