package TranslateNumbersToStrings;
/**
 *Created By Intellij IDEA
 * Author:chen
 * Date:2018/4/17
 * Time:10:39
 * Description:把数字翻译为字符串，非递归的方法，自底向上
**/

public class BetterSolution {
    public static int getTranslation(int num){
        if (num < 0)
            return 0;
        else if (num >= 0 && num <=10)
            return 1;
        else
            return getTranslation(String.valueOf(num));
    }
    public static int getTranslation(String snum){
        int f0 = 0;
        int f1 = 1;
        for (int i = snum.length() - 2; i >=0 ; i--) {
            int g = 0;
            int flagNum = Integer.valueOf(String.valueOf(snum.charAt(i)) + String.valueOf(snum.charAt(i + 1)));
            if ( flagNum >=10 && flagNum <=25){
                g = 1;
            }
            int tmp = f1;
            f1 = f1 + g * f0;
            f0 = tmp;
        }
        return f1;
    }

    public static void main(String[] args) {
        int num = 1225840140;
        System.out.println(getTranslation(num));
    }
}
