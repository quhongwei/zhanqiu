package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DoubleParam extends PreparedStatementParam<Double> {

    public DoubleParam(int paramIndex, Double paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setDouble(paramIndex, paramValue);
    }

}
