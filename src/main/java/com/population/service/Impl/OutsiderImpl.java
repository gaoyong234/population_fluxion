package com.population.service.Impl;

import com.population.dao.OutsiderMapper;
import com.population.pojo.User;
import com.population.service.OutsiderService;
import com.population.vo.OutsiderVo;
import com.population.vo.UserMyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OutsiderImpl implements OutsiderService {
    @Autowired
    private OutsiderMapper outsiderMapper;

    @Override
    public List<OutsiderVo> findOutsider(UserMyVo userProvince) {
        List<OutsiderVo> outList=outsiderMapper.findOutsider(userProvince);
        return outList;
    }
}
