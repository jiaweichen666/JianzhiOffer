package p41StreamMedian;

public class Main {
    public static void main(String[] args) {
        PriorityQueueSolution solution = new PriorityQueueSolution();
        solution.Insert(5);
        System.out.println(solution.GetMedian());
        solution.Insert(2);
        System.out.println(solution.GetMedian());
        solution.Insert(3);
        System.out.println(solution.GetMedian());
        solution.Insert(4);
        System.out.println(solution.GetMedian());
        solution.Insert(1);
        System.out.println(solution.GetMedian());
        solution.Insert(6);
        System.out.println(solution.GetMedian());
        solution.Insert(7);
        System.out.println(solution.GetMedian());
        solution.Insert(0);
        System.out.println(solution.GetMedian());
        solution.Insert(8);
        System.out.println(solution.GetMedian());


    }
}
