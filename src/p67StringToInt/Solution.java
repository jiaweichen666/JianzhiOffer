package p67StringToInt;

public class Solution {
    int StrToInt(String str) {
        if (str == null || str == "0" || str.length() == 0)
            return 0;
        int value = 0;
        boolean positive = true;
        if(str.startsWith("+") || (str.charAt(0)>='0' && str.charAt(0)<='9')){
            positive = true;
        }else if (str.startsWith("-"))
            positive = false;
        else
            return value;
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (i == 0 && (cur == '+' || cur == '-'))
                continue;
            if (cur >='0'&& cur <= '9') {
                value = value * 10;
                value = value + (cur - '0');
            }else
                return 0;

        }
        if(!positive){
            value = -value;
        }
        return value;
    }
}
