package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

public class TimeParam extends PreparedStatementParam<Time> {

    public TimeParam(int paramIndex, Time paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        if (null != calendar) {
            stmt.setTime(paramIndex, paramValue, calendar);
        } else {
            stmt.setTime(paramIndex, paramValue);
        }
    }

}
