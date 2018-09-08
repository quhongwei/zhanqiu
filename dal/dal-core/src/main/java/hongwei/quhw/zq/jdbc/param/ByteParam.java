package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ByteParam extends PreparedStatementParam<Byte> {

    public ByteParam(int paramIndex, Byte paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setByte(paramIndex, paramValue);
    }

}
