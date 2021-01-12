package com.population.controller;

import com.population.service.AllMessageService;
import com.population.vo.AllMessage;
import com.population.vo.EmployingVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/AllMessage")
public class AllMessageController {
    @Autowired
    private AllMessageService allMessageService;

    /**
     *  使用ModelAndView跳转到指定页面 addObject指定返回值
     * @param userId
     * @param modelAndView
     * @return
     */
    @RequestMapping("/toAllMessage")
    public ModelAndView toAllMessage(Integer userId, ModelAndView modelAndView){
         modelAndView.setViewName("allMessage/AllMessage");
         modelAndView.addObject("userId",userId);
         return modelAndView;
    }

    /**
     *  根据userId查询所有数据
     * @param userId
     * @return
     */
    @RequestMapping("/findAllMessage")
    @ResponseBody
    public AllMessage findAllMessage(Integer userId){
        AllMessage allMessage = allMessageService.findAllMessage(userId);
        EmployingVO employing = allMessage.getEmployingVO();
        String[] param = employing.getInsurance().split(",");
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < param.length; i++) {
            String s = param[i];
            list.add(Integer.parseInt(s));
        }
        employing.setInsuranceId(list);
        allMessage.setEmployingVO(employing);
        return allMessage;
    }
}
