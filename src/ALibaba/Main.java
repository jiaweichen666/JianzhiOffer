package ALibaba;

import java.util.Scanner;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static String process(String sentence) {

        String[] strArr = sentence.split("");
        String re = "";
        int count = 0;
        int end = 0;
        int i = 0,j = 0;
        try {
            for(i = 0; i < strArr.length; i ++) {
                for(j = i + 1; j < strArr.length; j ++) {
                    if(i+count < j && !strArr[i].equals("") && strArr[i+count].equals(strArr[j]) && !strArr[i].matches("[0-9]")) {
                        count ++;
                        end = j;
                    }else if(count > 1 && strArr[end].equals(strArr[end-count])){
                        for(int index = end - count + 1;  index <= end; index ++) {
                            strArr[index] = "";
                        }
                        count = 0;
                        end = 0;
                    }else {
                        count = 0;
                        end = 0;
                    }
                }
            }
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println(i);
            System.out.println(j);
            System.out.println(count);
            System.out.println(end);
        }
        for(i = 0;i <strArr.length; i++) {
            re += strArr[i];
        }
        return re;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _sentence;
        try {
            _sentence = in.nextLine();
        } catch (Exception e) {
            _sentence = null;
        }

        res = process(_sentence);
        System.out.println(res);
    }
}