package hongwei.quhw.zq.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:jdbc/jdbc-db.xml" })
public class JdbcTest {

    @Autowired
    private DataSource datasource;

    @Test
    public void test() throws Exception {
        long t = System.currentTimeMillis();
        String id = "id" + t;
        String name = "name" + t;
        String address = "address" + t;

        Connection conn = datasource.getConnection();
        PreparedStatement stmt = conn
            .prepareStatement("insert into student(id,name, address) values (?, ?, ?)");
        stmt.setString(1, id);
        stmt.setString(2, name);
        stmt.setString(3, address);

        int rows = stmt.executeUpdate();
        System.out.println(rows);

        stmt = conn.prepareStatement("select id,name, address from student where id=?");
        stmt.setString(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Assert.assertEquals(name, rs.getString("name"));
            Assert.assertEquals(address, rs.getString("address"));
        }
    }
}
