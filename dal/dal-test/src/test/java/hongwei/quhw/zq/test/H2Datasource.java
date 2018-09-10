package hongwei.quhw.zq.test;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

public class H2Datasource implements InitializingBean, DataSource {
    private DataSource[] dataSources;

    private int          dbCount = 1;

    private List<String> srciptPaths;

    private String       dbType;

    /** 
     * @see java.sql.Wrapper#isWrapperFor(java.lang.Class)
     */
    @Override
    public boolean isWrapperFor(Class<?> arg0) throws SQLException {
        return pickUp().isWrapperFor(arg0);
    }

    /** 
     * @see java.sql.Wrapper#unwrap(java.lang.Class)
     */
    @Override
    public <T> T unwrap(Class<T> arg0) throws SQLException {
        return pickUp().unwrap(arg0);
    }

    /** 
     * @see javax.sql.CommonDataSource#getLogWriter()
     */
    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return pickUp().getLogWriter();
    }

    /** 
     * @see javax.sql.CommonDataSource#getLoginTimeout()
     */
    @Override
    public int getLoginTimeout() throws SQLException {
        return pickUp().getLoginTimeout();
    }

    /** 
     * @see javax.sql.CommonDataSource#setLogWriter(java.io.PrintWriter)
     */
    @Override
    public void setLogWriter(PrintWriter arg0) throws SQLException {
        pickUp().setLogWriter(arg0);
    }

    /** 
     * @see javax.sql.CommonDataSource#setLoginTimeout(int)
     */
    @Override
    public void setLoginTimeout(int arg0) throws SQLException {
        pickUp().setLoginTimeout(arg0);
    }

    /** 
     * @see javax.sql.DataSource#getConnection()
     */
    @Override
    public Connection getConnection() throws SQLException {
        return pickUp().getConnection();
    }

    /** 
     * @see javax.sql.DataSource#getConnection(java.lang.String, java.lang.String)
     */
    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return pickUp().getConnection(username, password);
    }

    private DataSource pickUp() {
        return dataSources[0];
    }

    /** 
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        dataSources = new DataSource[dbCount];
        for (int i = 0; i < dbCount; i++) {

            EmbeddedDatabaseBuilder h2Bulier = new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2).setName("dal-db-" + dbType + i);
            for (String script : srciptPaths) {
                h2Bulier.addScript(script);
            }

            dataSources[i] = h2Bulier.build();
        }
    }

    /**
     * Setter method for property <tt>srciptPaths</tt>.
     * 
     * @param srciptPaths value to be assigned to property srciptPaths
     */
    public void setSrciptPaths(List<String> srciptPaths) {
        this.srciptPaths = srciptPaths;
    }

    /**
     * Setter method for property <tt>dbCount</tt>.
     * 
     * @param dbCount value to be assigned to property dbCount
     */
    public void setDbCount(int dbCount) {
        this.dbCount = dbCount;
    }

    /**
     * Setter method for property <tt>dbType</tt>.
     * 
     * @param dbType value to be assigned to property dbType
     */
    public void setDbType(String dbType) {
        this.dbType = dbType + System.currentTimeMillis();
    }

    /** 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + pickUp().hashCode();
        return result;
    }

    /** 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        H2Datasource other = (H2Datasource) obj;
        if (!Arrays.equals(dataSources, other.dataSources))
            return false;
        return true;
    }

    /** 
     * @see javax.sql.CommonDataSource#getParentLogger()
     */
    public java.util.logging.Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
