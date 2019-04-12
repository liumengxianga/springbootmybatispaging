package com.lmx.springbootmybatis.com.lmx;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmx.springbootmybatis.com.lmx.po.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
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
    public String findall(Model model, Integer pageNum) {

        if (pageNum == null) {
            pageNum = 1;
        }
        Page<Object> page = PageHelper.startPage(pageNum, 5);
        List<Student> list = ss.findall();
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        int pageSum = pageInfo.getPages();
        model.addAttribute("list", list);
        model.addAttribute("pageNum", pageNum);
        model.addAttribute("pageSum", pageSum);
        return "findall";
    }

    @RequestMapping("/delete")
    public String delete(int id) {

        ss.delete(id);
        return "redirect:findall";
    }
}
