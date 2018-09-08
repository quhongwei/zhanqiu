package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.SQLException;

public class RefParam extends PreparedStatementParam<Ref> {

    public RefParam(int paramIndex, Ref paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setRef(paramIndex, paramValue);
    }

}
