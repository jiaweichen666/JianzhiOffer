package p50_03DeleteDuplicCharInString;

/**
 * Author:chen
 * Time：2018/4/17/10:50
 * Description:删除字符串中重复出现的字符
 */
public class Main {
    public static void main(String[] args) {
        String s = "google";
        System.out.println(deleteDuplicChar(s));
    }
    public static String deleteDuplicChar(String s){
        boolean[] isExist = new boolean[256];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (isExist[chars[i]]){
                chars[i] = 32;
            }else {
                isExist[chars[i]] = true;
            }
        }
        String sss = String.valueOf(chars);
        return sss.replaceAll(" ","");
    }
}
