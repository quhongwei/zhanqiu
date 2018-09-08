package hongwei.quhw.zq.jdbc.param;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UnicodeStreamParam extends PreparedStatementParam<InputStream> {

    public UnicodeStreamParam(int paramIndex, InputStream paramValue) {
        super(paramIndex, paramValue);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setUnicodeStream(paramIndex, paramValue, lengthInteger);
    }
}
