package hongwei.quhw.zq.jdbc.param;

import java.io.Reader;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CharacterStreamParam extends PreparedStatementParam<Reader> {

    public CharacterStreamParam(int paramIndex, Reader paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        if (null != lengthLong) {
            stmt.setCharacterStream(paramIndex, paramValue, (long) lengthLong);
        } else if (null != lengthInteger) {
            stmt.setCharacterStream(paramIndex, paramValue, (int) lengthInteger);
        } else {
            stmt.setCharacterStream(paramIndex, paramValue);
        }

    }

}
