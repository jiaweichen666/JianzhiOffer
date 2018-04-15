package JinritoutiaoSecondExamination;
import java.util.*;

public class Main3 {
    public static void leastKBaseOnRedBlackTree(int k, double num,String nums, TreeMap<Double,String> map){
        if (k < 0)
            return;
            if (map.size() < k){
                map.put(num,nums);
            }else {
                double maxInMap = map.lastKey();
                if(maxInMap > num){
                    map.pollLastEntry();
                    map.put(num,nums);
                }
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int m = 0;
        List<Integer> list = new ArrayList<>(10000);
        TreeMap<Double ,String> treeMap = new TreeMap<>();
            int k = scanner.nextInt();
            int firstnum = scanner.nextInt();
            list.add(firstnum);
            while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            if (!list.isEmpty()) {
                Iterator<Integer> iterator = list.listIterator();
                while (iterator.hasNext()) {
                    int b = iterator.next();
                    double tmp = (double) b / num;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(b);
                    stringBuilder.append("|");
                    stringBuilder.append(num);
                    String s = stringBuilder.toString();
                    System.out.println(s);
                    leastKBaseOnRedBlackTree(k, tmp, s, treeMap);
                }
                list.add(num);
              }

        }
        /*Iterator<Map.Entry<Double,String>> iterator = treeMap.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry entry = iterator.next();
                Double key = (Double) entry.getKey();
                String value = (String) entry.getValue();
                System.out.println(key+" "+value);
            }*/
        String lastvalue = treeMap.pollLastEntry().getValue();
        String[] values = lastvalue.split("\\");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]+" ");
        }
    }
}
