package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ObjectParam extends PreparedStatementParam<Object> {

    public ObjectParam(int paramIndex, Object paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        if (null == targetSqlType) {
            stmt.setObject(paramIndex, paramValue);
        } else if (null == lengthInteger) {
            stmt.setObject(paramIndex, paramValue, (int) targetSqlType);
        } else {
            stmt.setObject(paramIndex, paramValue, (int) targetSqlType, (int) lengthInteger);
        }
    }

}
