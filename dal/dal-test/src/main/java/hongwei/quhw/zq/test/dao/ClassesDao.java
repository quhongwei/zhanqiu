package hongwei.quhw.zq.test.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import hongwei.quhw.zq.test.model.Classes;

/**
 * classes dao
 * 
 * @author hongwei.quhw
 * @version $Id: ClassesDao.java, v 0.1 2017年9月22日 下午3:14:49 hongwei.quhw Exp $
 */
public class ClassesDao extends SqlMapClientDaoSupport {
    public void insert(Classes clazzes) {
        getSqlMapClientTemplate().insert("rdf-dal-trans-classes-insert", clazzes);
    }

    public Classes getClasses(String id) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);

        return (Classes) getSqlMapClientTemplate()
            .queryForObject("rdf-dal-trans-classes-select-by-id", map);
    }

    public int update(Classes clazzes) {
        return getSqlMapClientTemplate().update("rdf-dal-trans-classes-update", clazzes);
    }

    public int delete(String id) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        return getSqlMapClientTemplate().delete("rdf-dal-trans-classes-delete", map);
    }
}
