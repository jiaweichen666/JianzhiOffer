package p16Power;

public class Solution {
    public double power(double base,int exponent){
        boolean invalidinput =false;
        if ((base == 0.0) && exponent<0){
            invalidinput = true;
            return 0.0;
        }
        int absExponet = Math.abs(exponent);
        double result = powerWithUnsinedExponet(base,absExponet);
        if (exponent < 0)
            return 1.0/result;
        return result;
    }
    public double powerWithUnsinedExponet(double base,int exponet){
        if (exponet == 0)
            return 1;
        if (exponet == 1)
            return base;
        double result = powerWithUnsinedExponet(base,exponet>>1);
        result *= result;
        if ((exponet & 0x1)==1){
            result = result * base;
        }
        return result;
    }
}
