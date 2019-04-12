package com.lmx.springbootmybatis.com.lmx.dao

import com.lmx.springbootmybatis.com.lmx.po.Student
import org.apache.ibatis.annotations.*
import org.springframework.stereotype.Repository

/**
 * @author LiumengMengXiang
 * @create 2019-04-11:18
 */
@Repository
@Mapper
interface StudentDao {
    @Select("select * from student")
    fun findall(): List<Student>

    @Select("select * from student where id=#{id}")
    fun findByid(id: Int): Student

    @Insert("insert into student(name,sex) values(#{name},#{sex})")
    fun insert(student: Student): Int

    @Update("update set name=#{name},sex=#{sex} where id=#{id}")
    fun update(student: Student): Int

    @Delete("delete * from student where id=#{id}")
    fun delete(id: Int): Int
}
