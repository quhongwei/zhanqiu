package hongwei.quhw.zq.jdbc.param;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AsciiStreamParam extends PreparedStatementParam<InputStream> {

    public AsciiStreamParam(int paramIndex, InputStream paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        if (null != lengthInteger) {
            stmt.setAsciiStream(paramIndex, paramValue, (int) lengthInteger);
        } else if (null != lengthLong) {
            stmt.setAsciiStream(paramIndex, paramValue, (long) lengthLong);
        } else {
            stmt.setAsciiStream(paramIndex, paramValue);
        }
    }

}
