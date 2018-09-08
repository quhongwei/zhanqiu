package hongwei.quhw.zq.jdbc.param;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DateParam extends PreparedStatementParam<Date> {

    public DateParam(int paramIndex, Date paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        if (null != calendar) {
            stmt.setDate(paramIndex, paramValue, calendar);
        } else {
            stmt.setDate(paramIndex, paramValue);
        }
    }

}
