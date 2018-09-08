package hongwei.quhw.zq.jdbc.param;

import java.io.Reader;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClobReaderParam extends PreparedStatementParam<Reader> {

    public ClobReaderParam(int paramIndex, Reader paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        if (null != lengthLong) {
            stmt.setClob(paramIndex, paramValue, (long) lengthLong);
        } else {
            stmt.setClob(paramIndex, paramValue);
        }
    }

}
