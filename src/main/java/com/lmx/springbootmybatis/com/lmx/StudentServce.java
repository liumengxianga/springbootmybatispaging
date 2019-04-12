package com.lmx.springbootmybatis.com.lmx;

import com.lmx.springbootmybatis.com.lmx.po.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author LiumengMengXiang
 * @create 2019-04-11:22
 */
public interface StudentServce {
    List<Student> findall();

    Student findByid(int id);

    boolean insert(Student student);

    boolean update(Student student);

    boolean delete(int id);
}
