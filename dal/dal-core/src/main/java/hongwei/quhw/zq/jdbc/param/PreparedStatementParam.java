package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public abstract class PreparedStatementParam<T> {
    protected int   paramIndex;

    protected T     paramValue;

    public Long     lengthLong;

    public Integer  lengthInteger;

    public Integer  targetSqlType;

    public String   typeName;

    public Calendar calendar;

    public PreparedStatementParam(int paramIndex, T paramValue) {
        this.paramIndex = paramIndex;
        this.paramValue = paramValue;
    }

    public abstract void setParam(PreparedStatement stmt) throws SQLException;;
}
