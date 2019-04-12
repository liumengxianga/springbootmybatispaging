package com.lmx.springbootmybatis.com.lmx

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

import javax.annotation.Resource

/**
 * @author LiumengMengXiang
 * @create 2019-04-11:25
 */
@Controller
class Herdle {
    @Resource
    private val ss: StudentServce? = null


    @RequestMapping("/findall")
    fun findall(map: MutableMap<String, Any>): String {
        map["list"] = ss!!.findall()
        return "findall"
    }

    @RequestMapping("/delete")
    fun delete(id: Int): String {

        ss!!.delete(id)
        return "redirect:findall"
    }
}
