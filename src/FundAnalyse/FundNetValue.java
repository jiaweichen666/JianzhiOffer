package FundAnalyse;

import java.math.BigDecimal;
import java.util.Date;

public class FundNetValue {
    private Date netValueDate;
    private BigDecimal netValue;

    public Date getNetValueDate() {
        return netValueDate;
    }

    public void setNetValueDate(Date netValueDate) {
        this.netValueDate = netValueDate;
    }

    public BigDecimal getNetValue() {
        return netValue;
    }

    public void setNetValue(BigDecimal netValue) {
        this.netValue = netValue;
    }

    public FundNetValue(Date netValueDate, BigDecimal netValue) {

        this.netValueDate = netValueDate;
        this.netValue = netValue;
    }
}
