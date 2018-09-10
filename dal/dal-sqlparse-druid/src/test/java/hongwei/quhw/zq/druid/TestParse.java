package hongwei.quhw.zq.druid;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlEvalVisitorImpl;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlExportParameterVisitor;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlOutputVisitor;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlSchemaStatVisitor;
import com.alibaba.druid.sql.parser.SQLStatementParser;

public class TestParse {

    @Test
    public void test2() {
        String sql = "select id,name from user  where id = ? and id = 'b'";

        // 新建 MySQL Parser
        SQLStatementParser parser = new MySqlStatementParser(sql);

        // 使用Parser解析生成AST，这里SQLStatement就是AST
        SQLStatement statement = parser.parseStatement();

        // 使用visitor来访问AST
        MySqlSchemaStatVisitor visitor = new MySqlSchemaStatVisitor();
        statement.accept(visitor);

        List<Object> parameters = new ArrayList<Object>();
        parameters.add("cccc");
        visitor.setParameters(parameters);

        // 从visitor中拿出你所关注的信息        
        System.out.println(visitor.getColumns());
        System.out.println(visitor.getConditions());
        System.out.println(visitor.getParameters());
        System.out.println(visitor.getVariants());
        System.out.println(visitor.getRelationships());
        System.out.println(visitor.getGroupByColumns());
        System.out.println("====================");
    }

    @Test
    public void test() {
        String sql = "select a.id,a.name from user a where a.id=? and a.name=?";

        // 新建 MySQL Parser
        SQLStatementParser parser = new MySqlStatementParser(sql);

        // 使用Parser解析生成AST，这里SQLStatement就是AST
        SQLStatement statement = parser.parseStatement();

        // 使用visitor来访问AST
        MySqlSchemaStatVisitor visitor = new MySqlSchemaStatVisitor();
        statement.accept(visitor);

        // 从visitor中拿出你所关注的信息        
        System.out.println(visitor.getColumns());
        System.out.println(visitor.getConditions());
        System.out.println("====================");

        StringBuffer buffer = new StringBuffer();
        MySqlOutputVisitor visitor2 = new MySqlOutputVisitor(buffer);
        statement.accept(visitor2);

        System.out.println(buffer.toString());
        System.out.println("====================");

        MySqlExportParameterVisitor v3 = new MySqlExportParameterVisitor();
        statement.accept(v3);
        System.out.println(v3.getParameters());
        System.out.println("====================");

        MySqlEvalVisitorImpl v4 = new MySqlEvalVisitorImpl();
        statement.accept(v4);
        System.out.println(v4.getParameters());
        System.out.println(v4.getFunction("aa"));
        System.out.println("====================");
    }
}
