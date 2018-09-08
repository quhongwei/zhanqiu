package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShortParam extends PreparedStatementParam<Short> {

    public ShortParam(int paramIndex, Short paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setShort(paramIndex, paramValue);
    }

}
