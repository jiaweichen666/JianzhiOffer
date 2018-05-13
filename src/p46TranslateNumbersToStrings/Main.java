package p46TranslateNumbersToStrings;

public class Main {
    public static void main(String[] args) {
        int num = 12258;
        System.out.println(getTranslationCount(num));

    }
    public static int getTranslationCount(int number){
        String snumber = number + "";
        return helper(snumber,0,snumber.length() - 1);

    }
    public static int  helper(String snum,int start,int end){
        if (end == start)
            return 1;
        else {
            int sum1 = helper(snum,start+1,end);
            int sum2 = 0;
            String c1 = String.valueOf(snum.charAt(start));
            String c2 = String.valueOf(snum.charAt(start+1));
            int c3 = Integer.valueOf(c1 + c2);
            if (c3 >= 10 && c3 <=25){
                sum2 = helper(snum,start+2,end);
            }
            return sum1 + sum2;
        }
    }
}
