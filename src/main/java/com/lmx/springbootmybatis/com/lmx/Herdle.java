package com.lmx.springbootmybatis.com.lmx;

import com.github.pagehelper.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author LiumengMengXiang
 * @create 2019-04-11:25
 */
@Controller
public class Herdle {
    @Resource
    private StudentServce ss;


    @RequestMapping("/findall")
    public String findall(Map<String, Object> map) {
        map.put("list", ss.findall());
        return "findall";
    }

    @RequestMapping("/delete")
    public String delete(int id) {

        ss.delete(id);
        return "redirect:findall";
    }
}
