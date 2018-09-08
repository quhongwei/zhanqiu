package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLXML;

public class SQLXMLParam extends PreparedStatementParam<SQLXML> {

    public SQLXMLParam(int paramIndex, SQLXML paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setSQLXML(paramIndex, paramValue);
    }

}
