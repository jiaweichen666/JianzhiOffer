package RegEx;

public class Main {
    public static void main(String[] args) {
        String s = "Hello world Monday!.chen    Offer";
        String [] ss = s.split("\\s+|\\.|\\t");
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }
}
