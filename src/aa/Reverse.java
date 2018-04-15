package aa;

public class Reverse {
    public static void main(String[] args) {
        String string = "www.toutiao.cn";
        char[] chars = string.toCharArray();
        int endding = chars.length - 1;
        reverse(0,endding,chars);
        System.out.println(chars);
        string = String.valueOf(chars);
        int start = string.indexOf(".");
        int end = string.indexOf(".",start+1);
        System.out.println(end);
        System.out.println(start);
        reverse(0,start - 1,chars);
        reverse(start + 1,end - 1,chars);
        reverse(end + 1,chars.length - 1,chars);
        System.out.println(chars);
    }
    public static void reverse(int start,int end,char[] chars){
        for (int i = 0; i <=(end - start)/2 ; i++) {
            char tmp = chars[start + i];
            chars[start + i] = chars[end - i];
            chars[end - i] = tmp;
        }
    }
}
