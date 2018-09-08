package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.RowId;
import java.sql.SQLException;

public class RowIdParam extends PreparedStatementParam<RowId> {

    public RowIdParam(int paramIndex, RowId paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setRowId(paramIndex, paramValue);
    }

}
