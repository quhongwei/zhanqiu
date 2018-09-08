package hongwei.quhw.zq.jdbc.param;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Copyright (C) 2013-2018 Ant Financial Services Group
 *
 * NULL值设定
 *
 * @author hongwei.quhw
 * @version $Id: NullParam.java, v 0.1 2018年9月8日 上午10:15:49 hongwei.quhw Exp $
 */
public class NullParam extends PreparedStatementParam<Integer> {

    public NullParam(int paramIndex, int sqlType) {
        super(paramIndex, sqlType);
    }

    @Override
    public void setParam(PreparedStatement stmt) throws SQLException {
        if (null != typeName) {
            stmt.setNull(paramIndex, paramValue, typeName);
        } else {
            stmt.setNull(paramIndex, paramValue);
        }
    }

}
