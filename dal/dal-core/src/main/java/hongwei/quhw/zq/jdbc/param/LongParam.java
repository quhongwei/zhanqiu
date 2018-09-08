package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LongParam extends PreparedStatementParam<Long>{

    public LongParam(int paramIndex, Long paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setLong(paramIndex, paramValue);
    }

}
