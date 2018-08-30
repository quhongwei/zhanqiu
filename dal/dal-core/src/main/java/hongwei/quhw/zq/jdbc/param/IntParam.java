package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IntParam extends PreparedStatementParam<Integer> {

    public IntParam(int paramIndex, Integer paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setInt(paramIndex, paramValue);
    }

}
