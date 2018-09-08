package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BooleanParam extends PreparedStatementParam<Boolean> {

    public BooleanParam(int paramIndex, Boolean paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setBoolean(paramIndex, paramValue);
    }

}
