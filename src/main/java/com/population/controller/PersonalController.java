package com.population.controller;

import com.population.pojo.User;
import com.population.pojo.personal;
import com.population.service.DicService;
import com.population.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/personal")
public class PersonalController {
    @Autowired
    private DicService dicService;

    @Autowired
    private PersonalService personalService;

    /**
     * 跳转到个人信息页面
     * @return
     */
    @RequestMapping("personal")
    public String personal(){
        return "basic/basic.html";
    }

    /**
     * 查询所有的字典表信息
     * @return 返回字典表信息的集合
     */
    @RequestMapping("findDic")
    @ResponseBody
    public List findDictionaries(){
        return dicService.findAll();
    }

    /**
     * 向数据库添加一个个人信息
     * @param personal 向数据库插入的的个人信息
     * @return 返回一个integer类型,来判断是否添加成功
     */
    @RequestMapping("inserPersonal")
    @ResponseBody
    public Integer inserPersonal(personal personal){
    Integer inner=personalService.inserPersonal(personal);
    return inner;
    }

    /**
     * 用来判断某个用户是否有自己的个人信息的表,在页面加载时便调用了这个方法
     * 并且,如果判断这个用户没有自己的个人信息的表,则根据用户ID创建一个个人信息的表
     * @param httpSession  用来接收Session中的用户的ID
     * @return 返回一个个人信息的表的ID
     */
    @RequestMapping("findUser")
    @ResponseBody
    public personal findUser(HttpSession httpSession){
        User admin = (User) httpSession.getAttribute("admin");
        Integer userId = admin.getUserId();
        personal personal=personalService.findUser(userId);
        return personal;
    }

    /**
     * 个人信息的保存操作
     * @param personal 前端传递过来的修改后的个人信息表
     * @return Integer用来判断是否修改成功
     */
    @RequestMapping("updatePersonal")
    @ResponseBody
    public Integer updatePersonal(personal personal){
       Integer integer= personalService.updatePersonal(personal);
       return integer;
    }

}
