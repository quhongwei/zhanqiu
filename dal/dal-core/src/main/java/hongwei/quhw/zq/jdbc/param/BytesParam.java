package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BytesParam extends PreparedStatementParam<byte[]> {

    public BytesParam(int paramIndex, byte[] paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setBytes(paramIndex, paramValue);
    }

}
