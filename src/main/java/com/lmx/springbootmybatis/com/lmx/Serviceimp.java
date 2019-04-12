package com.lmx.springbootmybatis.com.lmx;

import com.lmx.springbootmybatis.com.lmx.dao.StudentDao;
import com.lmx.springbootmybatis.com.lmx.po.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LiumengMengXiang
 * @create 2019-04-11:24
 */
@Service
public class Serviceimp implements StudentServce {
    @Resource
    private StudentDao sd;

    @Override
    public List<Student> findall() {
        return sd.findall();
    }

    @Override
    public Student findByid(int id) {
        return sd.findByid(id);
    }

    @Override
    public boolean insert(Student student) {
        if (sd.insert(student) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Student student) {
        if (sd.update(student) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (sd.delete(id) > 0) {
            return true;
        }
        return false;
    }
}
