package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StringParam extends PreparedStatementParam<String> {

    public StringParam(int paramIndex, String paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setString(paramIndex, paramValue);
    }
}
