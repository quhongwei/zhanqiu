package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class TimestampParam extends PreparedStatementParam<Timestamp> {

    public TimestampParam(int paramIndex, Timestamp paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        if (null != calendar) {
            stmt.setTimestamp(paramIndex, paramValue, calendar);
        } else {
            stmt.setTimestamp(paramIndex, paramValue);
        }
    }

}
