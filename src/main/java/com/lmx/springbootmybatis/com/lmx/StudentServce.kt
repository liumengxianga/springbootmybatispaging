package com.lmx.springbootmybatis.com.lmx

import com.lmx.springbootmybatis.com.lmx.po.Student
import org.apache.ibatis.annotations.Delete
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.annotations.Update

/**
 * @author LiumengMengXiang
 * @create 2019-04-11:22
 */
interface StudentServce {
    fun findall(): List<Student>

    fun findByid(id: Int): Student

    fun insert(student: Student): Boolean

    fun update(student: Student): Boolean

    fun delete(id: Int): Boolean
}
