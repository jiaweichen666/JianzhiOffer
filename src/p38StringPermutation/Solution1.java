package p38StringPermutation;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public void stringPermutation(String s){
        char[] chars = s.toCharArray();
        boolean[] visited = new boolean[chars.length];
        List<Character> out = new ArrayList<>();
        helper(chars,visited,0,out);
    }
    public void helper(char[] chars,boolean[] visited,int level,List<Character> out){
        if (level == chars.length){
            System.out.println(out);
        }
        for (int i = 0; i < chars.length; i++) {
            if (!visited[i]) {
                out.add(chars[i]);
                visited[i] = true;
                helper(chars,visited,level + 1,out);
                out.remove(out.size() - 1);
                visited[i] = false;
            }
        }
    }
}
