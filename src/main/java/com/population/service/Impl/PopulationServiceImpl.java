package com.population.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.population.dao.personalDao.PersonalsMapper;
import com.population.service.PopulationService;
import com.population.vo.PersonalVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PopulationServiceImpl implements PopulationService {

    @Autowired
    private PersonalsMapper personalMapper;

    @Override
    public PageInfo<PersonalVO> findPersonalInfo(Integer pageNum, Integer pageSize, PersonalVO personalVO) {
        PageHelper.startPage(pageNum,pageSize);
        List<PersonalVO> list = personalMapper.findPersonalInfo(personalVO);
        PageInfo<PersonalVO> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
