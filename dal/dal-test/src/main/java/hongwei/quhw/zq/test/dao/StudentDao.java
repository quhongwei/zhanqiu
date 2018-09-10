package hongwei.quhw.zq.test.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import hongwei.quhw.zq.test.model.Student;

/**
 * user dao
 * 
 * @author hongwei.quhw
 * @version $Id: UserDao.java, v 0.1 2017年9月22日 下午3:14:34 hongwei.quhw Exp $
 */
public class StudentDao extends SqlMapClientDaoSupport {
    public void insert(Student student) {
        getSqlMapClientTemplate().insert("rdf-dal-trans-student-insert", student);
    }

    public void insertWithEx(Student student) {
        getSqlMapClientTemplate().insert("rdf-dal-trans-student-insertxxxxx", student);
    }


    public Student getStudent(String id) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);

        return (Student) getSqlMapClientTemplate()
            .queryForObject("rdf-dal-trans-student-select-by-id", map);
    }

    public Student lock(String id) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);

        return (Student) getSqlMapClientTemplate()
            .queryForObject("rdf-dal-trans-student-select-by-id-for-update", map);
    }

    public int update(Student student) {
        return getSqlMapClientTemplate().update("rdf-dal-trans-student-update", student);
    }

    public int delete(String id) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        return getSqlMapClientTemplate().delete("rdf-dal-trans-student-delete", map);
    }

    public Student joinTest() {
        return (Student) getSqlMapClientTemplate().queryForObject("rdf-dal-jion-test");
    }
}
