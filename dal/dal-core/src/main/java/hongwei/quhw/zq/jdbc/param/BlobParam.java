package hongwei.quhw.zq.jdbc.param;

import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BlobParam extends PreparedStatementParam<Blob> {

    public BlobParam(int paramIndex, Blob paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setBlob(paramIndex, paramValue);
    }

}
