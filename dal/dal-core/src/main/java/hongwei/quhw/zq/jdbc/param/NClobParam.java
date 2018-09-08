package hongwei.quhw.zq.jdbc.param;

import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NClobParam extends PreparedStatementParam<NClob> {

    public NClobParam(int paramIndex, NClob paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setNClob(paramIndex, paramValue);
    }

}
