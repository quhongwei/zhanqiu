package hongwei.quhw.zq.jdbc;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import hongwei.quhw.zq.jdbc.param.ArrayParam;
import hongwei.quhw.zq.jdbc.param.AsciiStreamParam;
import hongwei.quhw.zq.jdbc.param.BigDecimalParam;
import hongwei.quhw.zq.jdbc.param.BinaryStreamParam;
import hongwei.quhw.zq.jdbc.param.BlobInputStreamParam;
import hongwei.quhw.zq.jdbc.param.BlobParam;
import hongwei.quhw.zq.jdbc.param.BooleanParam;
import hongwei.quhw.zq.jdbc.param.ByteParam;
import hongwei.quhw.zq.jdbc.param.BytesParam;
import hongwei.quhw.zq.jdbc.param.CharacterStreamParam;
import hongwei.quhw.zq.jdbc.param.ClobParam;
import hongwei.quhw.zq.jdbc.param.ClobReaderParam;
import hongwei.quhw.zq.jdbc.param.DateParam;
import hongwei.quhw.zq.jdbc.param.DoubleParam;
import hongwei.quhw.zq.jdbc.param.FloatParam;
import hongwei.quhw.zq.jdbc.param.IntParam;
import hongwei.quhw.zq.jdbc.param.LongParam;
import hongwei.quhw.zq.jdbc.param.NCharacterStreamParam;
import hongwei.quhw.zq.jdbc.param.NClobParam;
import hongwei.quhw.zq.jdbc.param.NClobReaderParam;
import hongwei.quhw.zq.jdbc.param.NStringParam;
import hongwei.quhw.zq.jdbc.param.NullParam;
import hongwei.quhw.zq.jdbc.param.ObjectParam;
import hongwei.quhw.zq.jdbc.param.PreparedStatementParam;
import hongwei.quhw.zq.jdbc.param.RefParam;
import hongwei.quhw.zq.jdbc.param.RowIdParam;
import hongwei.quhw.zq.jdbc.param.SQLXMLParam;
import hongwei.quhw.zq.jdbc.param.ShortParam;
import hongwei.quhw.zq.jdbc.param.StringParam;
import hongwei.quhw.zq.jdbc.param.TimeParam;
import hongwei.quhw.zq.jdbc.param.TimestampParam;
import hongwei.quhw.zq.jdbc.param.URLParam;
import hongwei.quhw.zq.jdbc.param.UnicodeStreamParam;

/**
 * Copyright (C) 2013-2018 Ant Financial Services Group
 *
 *public void updateBalance(Connection con, String name,double balance) {
 6         try {
 7             String sql = "UPDATE account SET balance=balance+? WHERE name=?";
 8             PreparedStatement pstmt = con.prepareStatement(sql);
 9             pstmt.setDouble(1,balance);
10             pstmt.setString(2,name);
11             pstmt.executeUpdate();
12         }catch (Exception e) {
13             throw new RuntimeException(e);
14         }
15     }
 *
 * @author hongwei.quhw
 * @version $Id: PreparedStatementProxy.java, v 0.1 2018年8月20日 下午10:52:01 hongwei.quhw Exp $
 */
public class PreparedStatementProxy implements PreparedStatement {
    private List<PreparedStatementParam<?>> params = new ArrayList<PreparedStatementParam<?>>();

    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        return null;
    }

    @Override
    public int executeUpdate(String sql) throws SQLException {
        // 这里真正执行

        return 0;
    }

    @Override
    public void close() throws SQLException {
    }

    @Override
    public int getMaxFieldSize() throws SQLException {
        return 0;
    }

    @Override
    public void setMaxFieldSize(int max) throws SQLException {
    }

    @Override
    public int getMaxRows() throws SQLException {
        return 0;
    }

    @Override
    public void setMaxRows(int max) throws SQLException {
    }

    @Override
    public void setEscapeProcessing(boolean enable) throws SQLException {
    }

    @Override
    public int getQueryTimeout() throws SQLException {
        return 0;
    }

    @Override
    public void setQueryTimeout(int seconds) throws SQLException {
    }

    @Override
    public void cancel() throws SQLException {
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }

    @Override
    public void clearWarnings() throws SQLException {
    }

    @Override
    public void setCursorName(String name) throws SQLException {
    }

    @Override
    public boolean execute(String sql) throws SQLException {
        return false;
    }

    @Override
    public ResultSet getResultSet() throws SQLException {
        return null;
    }

    @Override
    public int getUpdateCount() throws SQLException {
        return 0;
    }

    @Override
    public boolean getMoreResults() throws SQLException {
        return false;
    }

    @Override
    public void setFetchDirection(int direction) throws SQLException {
    }

    @Override
    public int getFetchDirection() throws SQLException {
        return 0;
    }

    @Override
    public void setFetchSize(int rows) throws SQLException {
    }

    @Override
    public int getFetchSize() throws SQLException {
        return 0;
    }

    @Override
    public int getResultSetConcurrency() throws SQLException {
        return 0;
    }

    @Override
    public int getResultSetType() throws SQLException {
        return 0;
    }

    @Override
    public void addBatch(String sql) throws SQLException {
    }

    @Override
    public void clearBatch() throws SQLException {
    }

    @Override
    public int[] executeBatch() throws SQLException {
        return null;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }

    @Override
    public boolean getMoreResults(int current) throws SQLException {
        return false;
    }

    @Override
    public ResultSet getGeneratedKeys() throws SQLException {
        return null;
    }

    @Override
    public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        return 0;
    }

    @Override
    public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
        return 0;
    }

    @Override
    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        return 0;
    }

    @Override
    public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
        return false;
    }

    @Override
    public boolean execute(String sql, int[] columnIndexes) throws SQLException {
        return false;
    }

    @Override
    public boolean execute(String sql, String[] columnNames) throws SQLException {
        return false;
    }

    @Override
    public int getResultSetHoldability() throws SQLException {
        return 0;
    }

    @Override
    public boolean isClosed() throws SQLException {
        return false;
    }

    @Override
    public void setPoolable(boolean poolable) throws SQLException {
    }

    @Override
    public boolean isPoolable() throws SQLException {
        return false;
    }

    @Override
    public void closeOnCompletion() throws SQLException {
    }

    @Override
    public boolean isCloseOnCompletion() throws SQLException {
        return false;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public ResultSet executeQuery() throws SQLException {
        return null;
    }

    @Override
    public int executeUpdate() throws SQLException {
        return 0;
    }

    @Override
    public void setNull(int parameterIndex, int sqlType) throws SQLException {
        params.add(new NullParam(parameterIndex, sqlType));
    }

    @Override
    public void setBoolean(int parameterIndex, boolean x) throws SQLException {
        params.add(new BooleanParam(parameterIndex, x));
    }

    @Override
    public void setByte(int parameterIndex, byte x) throws SQLException {
        params.add(new ByteParam(parameterIndex, x));
    }

    @Override
    public void setShort(int parameterIndex, short x) throws SQLException {
        params.add(new ShortParam(parameterIndex, x));
    }

    @Override
    public void setInt(int parameterIndex, int x) throws SQLException {
        params.add(new IntParam(parameterIndex, x));
    }

    @Override
    public void setLong(int parameterIndex, long x) throws SQLException {
        params.add(new LongParam(parameterIndex, x));
    }

    @Override
    public void setFloat(int parameterIndex, float x) throws SQLException {
        params.add(new FloatParam(parameterIndex, x));
    }

    @Override
    public void setDouble(int parameterIndex, double x) throws SQLException {
        params.add(new DoubleParam(parameterIndex, x));
    }

    @Override
    public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
        params.add(new BigDecimalParam(parameterIndex, x));
    }

    @Override
    public void setString(int parameterIndex, String x) throws SQLException {
        params.add(new StringParam(parameterIndex, x));
    }

    @Override
    public void setBytes(int parameterIndex, byte[] x) throws SQLException {
        params.add(new BytesParam(parameterIndex, x));
    }

    @Override
    public void setDate(int parameterIndex, Date x) throws SQLException {
        params.add(new DateParam(parameterIndex, x));
    }

    @Override
    public void setTime(int parameterIndex, Time x) throws SQLException {
        params.add(new TimeParam(parameterIndex, x));
    }

    @Override
    public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
        params.add(new TimestampParam(parameterIndex, x));
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
        AsciiStreamParam param = new AsciiStreamParam(parameterIndex, x);
        param.lengthInteger = length;
        params.add(param);
    }

    @Override
    public void setUnicodeStream(int parameterIndex, InputStream x,
                                 int length) throws SQLException {
        UnicodeStreamParam param = new UnicodeStreamParam(parameterIndex, x);
        param.lengthInteger = length;
        params.add(param);
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
        BinaryStreamParam param = new BinaryStreamParam(parameterIndex, x);
        param.lengthInteger = length;
        params.add(param);
    }

    @Override
    public void clearParameters() throws SQLException {
    }

    @Override
    public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
        ObjectParam param = new ObjectParam(parameterIndex, x);
        param.targetSqlType = targetSqlType;
        params.add(param);
    }

    @Override
    public void setObject(int parameterIndex, Object x) throws SQLException {
        params.add(new ObjectParam(parameterIndex, x));
    }

    @Override
    public boolean execute() throws SQLException {
        return false;
    }

    @Override
    public void addBatch() throws SQLException {
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader,
                                   int length) throws SQLException {
        CharacterStreamParam param = new CharacterStreamParam(parameterIndex, reader);
        param.lengthInteger = length;
        params.add(param);
    }

    @Override
    public void setRef(int parameterIndex, Ref x) throws SQLException {
        params.add(new RefParam(parameterIndex, x));
    }

    @Override
    public void setBlob(int parameterIndex, Blob x) throws SQLException {
        params.add(new BlobParam(parameterIndex, x));
    }

    @Override
    public void setClob(int parameterIndex, Clob x) throws SQLException {
        params.add(new ClobParam(parameterIndex, x));
    }

    @Override
    public void setArray(int parameterIndex, Array x) throws SQLException {
        params.add(new ArrayParam(parameterIndex, x));
    }

    @Override
    public ResultSetMetaData getMetaData() throws SQLException {
        return null;
    }

    @Override
    public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
        DateParam param = new DateParam(parameterIndex, x);
        param.calendar = cal;
        params.add(param);
    }

    @Override
    public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
        TimeParam param = new TimeParam(parameterIndex, x);
        param.calendar = cal;
        params.add(param);
    }

    @Override
    public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
        TimestampParam param = new TimestampParam(parameterIndex, x);
        param.calendar = cal;
        params.add(param);
    }

    @Override
    public void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException {
        NullParam param = new NullParam(parameterIndex, sqlType);
        param.typeName = typeName;
        params.add(param);
    }

    @Override
    public void setURL(int parameterIndex, URL x) throws SQLException {
        params.add(new URLParam(parameterIndex, x));
    }

    @Override
    public ParameterMetaData getParameterMetaData() throws SQLException {
        return null;
    }

    @Override
    public void setRowId(int parameterIndex, RowId x) throws SQLException {
        params.add(new RowIdParam(parameterIndex, x));
    }

    @Override
    public void setNString(int parameterIndex, String value) throws SQLException {
        params.add(new NStringParam(parameterIndex, value));
    }

    @Override
    public void setNCharacterStream(int parameterIndex, Reader value,
                                    long length) throws SQLException {
        NCharacterStreamParam param = new NCharacterStreamParam(parameterIndex, value);
        param.lengthLong = length;
        params.add(param);
    }

    @Override
    public void setNClob(int parameterIndex, NClob value) throws SQLException {
        params.add(new NClobParam(parameterIndex, value));
    }

    @Override
    public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {
        ClobReaderParam param = new ClobReaderParam(parameterIndex, reader);
        param.lengthLong = length;
        params.add(param);
    }

    @Override
    public void setBlob(int parameterIndex, InputStream inputStream,
                        long length) throws SQLException {
        BlobInputStreamParam param = new BlobInputStreamParam(parameterIndex, inputStream);
        param.lengthLong = length;
        params.add(param);
    }

    @Override
    public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {
        NClobReaderParam param = new NClobReaderParam(parameterIndex, reader);
        param.lengthLong = length;
        params.add(param);
    }

    @Override
    public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {
        params.add(new SQLXMLParam(parameterIndex, xmlObject));
    }

    @Override
    public void setObject(int parameterIndex, Object x, int targetSqlType,
                          int scaleOrLength) throws SQLException {
        ObjectParam param = new ObjectParam(parameterIndex, x);
        param.targetSqlType = targetSqlType;
        param.lengthInteger = scaleOrLength;
        params.add(param);
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {
        AsciiStreamParam param = new AsciiStreamParam(parameterIndex, x);
        param.lengthLong = length;
        params.add(param);
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x,
                                long length) throws SQLException {
        BinaryStreamParam param = new BinaryStreamParam(parameterIndex, x);
        param.lengthLong = length;
        params.add(param);
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader,
                                   long length) throws SQLException {
        CharacterStreamParam param = new CharacterStreamParam(parameterIndex, reader);
        param.lengthLong = length;
        params.add(param);
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {
        params.add(new AsciiStreamParam(parameterIndex, x));
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {
        params.add(new BinaryStreamParam(parameterIndex, x));
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {
        params.add(new CharacterStreamParam(parameterIndex, reader));
    }

    @Override
    public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {
        params.add(new NCharacterStreamParam(parameterIndex, value));
    }

    @Override
    public void setClob(int parameterIndex, Reader reader) throws SQLException {
        params.add(new ClobReaderParam(parameterIndex, reader));
    }

    @Override
    public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {
        params.add(new BlobInputStreamParam(parameterIndex, inputStream));
    }

    @Override
    public void setNClob(int parameterIndex, Reader reader) throws SQLException {
        params.add(new NClobReaderParam(parameterIndex, reader));
    }

}
