package com.lmx.springbootmybatis.com.lmx.dao;

import com.lmx.springbootmybatis.com.lmx.po.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LiumengMengXiang
 * @create 2019-04-11:18
 */
@Repository
@Mapper
public interface StudentDao {
    @Select("select * from student")
    List<Student> findall();

    @Select("select * from student where id=#{id}")
    Student findByid(int id);

    @Insert("insert into student(name,sex) values(#{name},#{sex})")
    int insert(Student student);

    @Update("update set name=#{name},sex=#{sex} where id=#{id}")
    int update(Student student);

    @Delete("delete * from student where id=#{id}")
    int delete(int id);
}
