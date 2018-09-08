package hongwei.quhw.zq.jdbc.param;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArrayParam extends PreparedStatementParam<Array> {

    public ArrayParam(int paramIndex, Array paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setArray(paramIndex, paramValue);
    }

}
