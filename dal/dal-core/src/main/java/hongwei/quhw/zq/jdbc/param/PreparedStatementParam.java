package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class PreparedStatementParam<T> {
    protected int paramIndex;

    protected T   paramValue;

    public PreparedStatementParam(int paramIndex, T paramValue) {
        this.paramIndex = paramIndex;
        this.paramValue = paramValue;
    }

    public abstract void setParam(PreparedStatement stmt) throws SQLException;;
}
