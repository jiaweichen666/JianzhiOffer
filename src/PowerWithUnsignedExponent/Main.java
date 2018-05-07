package PowerWithUnsignedExponent;

public class Main {
    public static void main(String[] args) {
        System.out.println(PowerWithUnsignedExponent(2,33));
    }
    public static double PowerWithUnsignedExponent(double base,int exponent){
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        double result = PowerWithUnsignedExponent(base,exponent >> 1);
        result *= result;
        if ((exponent & 1) == 1)
            result *= base;
        return result;
    }
}
