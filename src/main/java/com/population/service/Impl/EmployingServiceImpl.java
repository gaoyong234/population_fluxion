package com.population.service.Impl;

import com.population.dao.Employing.EmployingDaoMapper;
import com.population.pojo.Employing;
import com.population.service.EmployingService;
import com.population.util.ReturnUtil;
import com.population.vo.EmployingVO;
import com.population.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class EmployingServiceImpl implements EmployingService {
    @Autowired
    private EmployingDaoMapper employingDaoMapper;


    @Override
    public Message addEmploying(Employing employing) {
        employing.setGmtCreate(new Date());
        Integer num = employingDaoMapper.insertEmploying(employing);
        Message message = ReturnUtil.returnDataOperation("添加", num);
        return message;
    }

    @Override
    public Message changeEmploying(Employing employing) {
        employing.setGmtModified(new Date());
        Integer num = employingDaoMapper.updateEmploying(employing);
        Message message = ReturnUtil.returnDataOperation("修改", num);
        return message;
    }

    @Override
    public Message removeEmployingUpdate(Integer empId) {
        Integer num = employingDaoMapper.deleteEmployingUpdate(empId);
        Message message = ReturnUtil.returnDataOperation("删除", num);
        return message;
    }

    @Override
    public List<EmployingVO> findAllEmploying() {
        return null;
    }

    @Override
    public EmployingVO findEmploying(Integer userId) {
        return employingDaoMapper.selectEmploying(userId);
    }

    @Override
    public Integer findEmployingCount(Integer userId) {
        return employingDaoMapper.selectEmployingCount(userId);
    }
}
