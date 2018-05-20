package p05ReplaceSpaces;

/**
 * Description：将字符串中的空格换成%20
 * Tips：先遍历一边计算空格的个数，新数组的长度为原来数组的长度加上空格数乘以二
 * 从原数组最后开始遍历，若当前值不等于空格直接复制到新数组并调整指针
 * 若等于空格则新数组依次从后往前写入0/2/%并且调整指针
 * 直到遍历完成。
 */
public class Main {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("We are happy");
        System.out.println(replaceSpace(stringBuffer));
    }
    public static String replaceSpace(StringBuffer str) {
        if (str == null)
            return null;
        char[] chars = str.toString().toCharArray();
        int spaceNum = 0;
        for (int i = 0; i < chars.length ; i++) {
            if (chars[i] == ' ')
                spaceNum++;
        }
        char[] newChars = new char[chars.length + 2 * spaceNum];
        int i = newChars.length - 1;
        int j = chars.length - 1;
        while (j >= 0){
            if(chars[j] != ' '){
                newChars[i--] = chars[j--];
            }else {
                newChars[i--] = '0';
                newChars[i--] = '2';
                newChars[i--] = '%';
                j--;
            }
        }
        return String.valueOf(newChars);
    }
}
