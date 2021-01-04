package com.population.service.Impl;

import com.population.dao.DicDao.DicDaoMapper;
import com.population.dao.DicMapper;
import com.population.pojo.Dic;
import com.population.service.DicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicImpl implements DicService {
    @Autowired
    private DicMapper dicMapper;
    @Autowired
    private DicDaoMapper dicDaoMapper;

    @Override
    public List<Dic> findAll() {
        List<Dic> dics= dicMapper.findAll();
        return dics;
    }

    @Override
    public List<Dic> findDicByParentId(Integer parentId) {
        return dicDaoMapper.selectDicByParentId(parentId);
    }
}
