package hongwei.quhw.zq.jdbc.param;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BinaryStreamParam extends PreparedStatementParam<InputStream> {

    public BinaryStreamParam(int paramIndex, InputStream paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        if (null != lengthLong) {
            stmt.setBinaryStream(paramIndex, paramValue, (long) lengthLong);
        } else if (null != lengthInteger) {
            stmt.setBinaryStream(paramIndex, paramValue, (int) lengthInteger);
        } else {
            stmt.setBinaryStream(paramIndex, paramValue);
        }
    }

}
