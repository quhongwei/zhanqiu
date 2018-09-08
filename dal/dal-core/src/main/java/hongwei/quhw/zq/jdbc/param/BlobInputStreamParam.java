package hongwei.quhw.zq.jdbc.param;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BlobInputStreamParam extends PreparedStatementParam<InputStream> {

    public BlobInputStreamParam(int paramIndex, InputStream paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        if (null != lengthLong) {
            stmt.setBlob(paramIndex, paramValue, (long) lengthLong);
        } else {
            stmt.setBlob(paramIndex, paramValue);
        }
    }

}
