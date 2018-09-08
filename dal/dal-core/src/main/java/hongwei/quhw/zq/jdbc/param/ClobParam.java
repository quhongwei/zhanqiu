package hongwei.quhw.zq.jdbc.param;

import java.sql.Clob;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClobParam extends PreparedStatementParam<Clob> {

    public ClobParam(int paramIndex, Clob paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setClob(paramIndex, paramValue);
    }

}
