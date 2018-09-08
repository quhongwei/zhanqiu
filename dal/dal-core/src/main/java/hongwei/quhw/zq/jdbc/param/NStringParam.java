package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NStringParam extends PreparedStatementParam<String> {

    public NStringParam(int paramIndex, String paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setNString(paramIndex, paramValue);
    }

}
