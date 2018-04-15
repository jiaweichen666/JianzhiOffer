package FundAnalyse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FundNetValue> list =  new ArrayList<>();
        FundNetValue[] fundNetValues = new FundNetValue[10];
        Date[] dates = new Date[10];
        for (int i = 0; i < 10; i++) {
            dates[i] = new Date(i);
        }
        fundNetValues[0] = new FundNetValue(dates[0],new BigDecimal(2));
        fundNetValues[1] = new FundNetValue(dates[1],new BigDecimal(6));
        fundNetValues[2] = new FundNetValue(dates[2],new BigDecimal(9));
        fundNetValues[3] = new FundNetValue(dates[3],new BigDecimal(15));
        fundNetValues[4] = new FundNetValue(dates[4],new BigDecimal(12));
        fundNetValues[5] = new FundNetValue(dates[5],new BigDecimal(10));
        fundNetValues[6] = new FundNetValue(dates[6],new BigDecimal(11));
        fundNetValues[7] = new FundNetValue(dates[7],new BigDecimal(12));
        fundNetValues[8] = new FundNetValue(dates[8],new BigDecimal(14));
        fundNetValues[9] = new FundNetValue(dates[9],new BigDecimal(18));
        for (int i = 0; i <10 ; i++) {
            list.add(fundNetValues[i]);
        }
        System.out.println(FundAnalyseTool.analyse(list));
    }
}
