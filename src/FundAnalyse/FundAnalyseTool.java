package FundAnalyse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class FundAnalyseTool {
    public static BigDecimal analyse(List<FundNetValue> netValues) {
        List<BigDecimal> list = new ArrayList<>();
        netValues.sort(new Comparator<FundNetValue>() {
            @Override
            public int compare(FundNetValue o1, FundNetValue o2) {
                if (o1.getNetValueDate().after(o2.getNetValueDate())){
                    return 1;
                }else if (o1.getNetValueDate().before(o2.getNetValueDate())){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        /*for (int i = 0; i < netValues.size(); i++) {
            System.out.println(netValues.get(i).getNetValue());
            BigDecimal max = new BigDecimal(Integer.MIN_VALUE);
            for (int j = i+1; j < netValues.size(); j++) {
                BigDecimal value1 = netValues.get(i).getNetValue();
                BigDecimal value2 = netValues.get(j).getNetValue();
                BigDecimal tmp = (value1.subtract(value2)).divide(value1,5,BigDecimal.ROUND_HALF_UP);
                if (tmp.compareTo(max) > 0){
                    max = tmp;
                }
            }
            list.add(max);
        }*/
        BigDecimal maxvalue = new BigDecimal(Integer.MIN_VALUE);
        BigDecimal minValue = new BigDecimal(Integer.MAX_VALUE);
        BigDecimal maxRate = new BigDecimal(Integer.MIN_VALUE);
        for (int i = 0; i < netValues.size(); i++) {
            if (netValues.get(i).getNetValue().compareTo(maxvalue) > 0) {
                maxvalue = netValues.get(i).getNetValue();
                minValue = maxvalue;
            }else if (netValues.get(i).getNetValue().compareTo(minValue) < 0){
                minValue = netValues.get(i).getNetValue();
            }
            if (maxvalue.compareTo(minValue) > 0){
                BigDecimal tmp = (maxvalue.subtract(minValue)).divide(maxvalue,4,BigDecimal.ROUND_HALF_UP);
                if (tmp.compareTo(maxRate) > 0){
                    maxRate = tmp;
                }
            }
        }
        return maxRate;
       /*list.sort(new Comparator<BigDecimal>() {
           @Override
           public int compare(BigDecimal o1, BigDecimal o2) {
               return o1.compareTo(o2);
           }
       });
        System.out.println(list.toString());
        return list.get(list.size() - 1);*/
    }
}
