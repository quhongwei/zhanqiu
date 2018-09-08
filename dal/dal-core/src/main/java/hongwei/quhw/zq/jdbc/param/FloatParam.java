package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FloatParam extends PreparedStatementParam<Float> {

    public FloatParam(int paramIndex, Float paramValue) {
        super(paramIndex, paramValue);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        stmt.setFloat(paramIndex, paramValue);
    }

}
