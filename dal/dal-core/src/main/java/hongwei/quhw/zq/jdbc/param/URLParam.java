package hongwei.quhw.zq.jdbc.param;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class URLParam extends PreparedStatementParam<URL> {

    public URLParam(int paramIndex, URL paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setURL(paramIndex, paramValue);
    }

}
