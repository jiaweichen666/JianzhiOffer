package p12StringPathInMatirx;

public class Main {
    public static void main(String[] args) {
        Solution2 solution =  new Solution2();
        char[] matrix = {'A','B','C','E','S','F','C','S','A','D','E','E'};
        char[] str = {'A','B','C','C','E','D'};
        System.out.println(solution.hasPath(matrix,3,4,str));
    }
}
