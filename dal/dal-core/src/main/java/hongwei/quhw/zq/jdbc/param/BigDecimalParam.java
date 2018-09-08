package hongwei.quhw.zq.jdbc.param;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BigDecimalParam extends PreparedStatementParam<BigDecimal>{

    public BigDecimalParam(int paramIndex, BigDecimal paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
    }

}
