package com.population.controller;

import com.population.pojo.Employing;
import com.population.pojo.User;
import com.population.service.EmployingService;
import com.population.vo.EmployingVO;
import com.population.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/Employing")
public class EmployingController {

    @Autowired
    private EmployingService employingService;

    @RequestMapping("/toEmploying")
    public String toEmploying(){
        return "employing/EmployingMessage";
    }

    /**
     * 添加数据/修改数据
     * @param employingVO
     * @param session
     * @return
     */
    @RequestMapping("/addEmploying")
    @ResponseBody
    public Message addEmploying(EmployingVO employingVO , HttpSession session){
        User admin = (User) session.getAttribute("admin");
        employingVO.setInsurance(employingVO.getInsuranceId().stream().map(String::valueOf).collect(Collectors.joining(",")));
        if (employingService.findEmployingCount(admin.getUserId())>0){
            return employingService.changeEmploying(employingVO);
        }
        employingVO.setSpareInt(admin.getUserId());
        return employingService.addEmploying(employingVO);
    }
    @RequestMapping("/findEmploying")
    @ResponseBody
    public EmployingVO findEmploying(HttpSession session){
        User admin = (User) session.getAttribute("admin");
        EmployingVO employing = employingService.findEmploying(admin.getUserId());
        String[] param = employing.getInsurance().split(",");
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < param.length; i++) {
            String s = param[i];
            list.add(Integer.parseInt(s));
        }
        employing.setInsuranceId(list);
        return employing;
    }

}
