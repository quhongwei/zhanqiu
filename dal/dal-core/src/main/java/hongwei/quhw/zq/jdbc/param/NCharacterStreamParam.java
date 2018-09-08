package hongwei.quhw.zq.jdbc.param;

import java.io.Reader;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NCharacterStreamParam extends PreparedStatementParam<Reader> {

    public NCharacterStreamParam(int paramIndex, Reader paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        if (null != lengthLong) {
            stmt.setNCharacterStream(paramIndex, paramValue, (long) lengthLong);
        } else {
            stmt.setNCharacterStream(paramIndex, paramValue);
        }
    }

}
