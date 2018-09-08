package hongwei.quhw.zq.jdbc.param;

import java.io.Reader;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NClobReaderParam extends PreparedStatementParam<Reader> {

    public NClobReaderParam(int paramIndex, Reader paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        if (null != lengthLong) {
            stmt.setNClob(paramIndex, paramValue, (int) lengthInteger);
        } else {
            stmt.setNClob(paramIndex, paramValue);
        }
    }

}
