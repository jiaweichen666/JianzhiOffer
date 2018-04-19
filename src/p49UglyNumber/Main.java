package p49UglyNumber;

/**
 * Description：第n个丑数
 * Author：chen
 * Time：2018/4/19
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(getUglyNumber(1500));
    }
    public static int getUglyNumber(int index){
        if (index <= 0 ){
            return -1;
        }
        int[] uglyNumbers = new int[index];
        uglyNumbers[0] = 1;
        int nextIndex = 1;
        int multiply2 = 1;
        int mindex2 = 0,mindex3 = 0,mindex5 = 0;
        int multiply3 = 1;
        int multiply5 = 1;
        while (nextIndex < index){
            int nextNum = minUglyNum(multiply2 * 2,multiply3 * 3,multiply5 * 5);
            uglyNumbers[nextIndex] = nextNum;
            while (multiply2*2 <= uglyNumbers[nextIndex])
                multiply2 = uglyNumbers[mindex2++];
            while (multiply3*3 <= uglyNumbers[nextIndex])
                multiply3 = uglyNumbers[mindex3++];
            while (multiply5*5 <= uglyNumbers[nextIndex])
                multiply5 = uglyNumbers[mindex5++];
            nextIndex++;
        }
        return uglyNumbers[index - 1];
    }
    private static int minUglyNum(int num1,int num2,int num3){
        int min = Math.min(num1,num2);
        return Math.min(num3,min);
    }
}
