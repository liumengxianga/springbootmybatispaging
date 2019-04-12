package com.lmx.springbootmybatis.com.lmx

import com.lmx.springbootmybatis.com.lmx.dao.StudentDao
import com.lmx.springbootmybatis.com.lmx.po.Student
import org.springframework.stereotype.Service

import javax.annotation.Resource

/**
 * @author LiumengMengXiang
 * @create 2019-04-11:24
 */
@Service
class Serviceimp : StudentServce {
    @Resource
    private val sd: StudentDao? = null

    override fun findall(): List<Student> {
        return sd!!.findall()
    }

    override fun findByid(id: Int): Student {
        return sd!!.findByid(id)
    }

    override fun insert(student: Student): Boolean {
        return if (sd!!.insert(student) > 0) {
            true
        } else false
    }

    override fun update(student: Student): Boolean {
        return if (sd!!.update(student) > 0) {
            true
        } else false
    }

    override fun delete(id: Int): Boolean {
        return if (sd!!.delete(id) > 0) {
            true
        } else false
    }
}
