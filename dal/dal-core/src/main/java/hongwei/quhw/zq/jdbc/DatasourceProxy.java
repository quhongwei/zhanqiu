package hongwei.quhw.zq.jdbc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class DatasourceProxy implements DataSource {

    private DataSource dataSource;

    public PrintWriter getLogWriter() throws SQLException {
        return dataSource.getLogWriter();
    }

    public int getLoginTimeout() throws SQLException {
        return dataSource.getLoginTimeout();
    }

    public void setLogWriter(PrintWriter out) throws SQLException {
        dataSource.setLogWriter(out);
    }

    public void setLoginTimeout(int seconds) throws SQLException {
        dataSource.setLoginTimeout(seconds);
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return dataSource.isWrapperFor(iface);
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        return dataSource.unwrap(iface);
    }

    public Connection getConnection() throws SQLException {
        return new ConnectionProxy();
    }

    public Connection getConnection(String username, String password) throws SQLException {
        return new ConnectionProxy();
    }

    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return dataSource.getParentLogger();
    }

}
