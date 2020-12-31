package com.population.service.Impl;

import com.population.dao.MateDao.MateDaoMapper;
import com.population.pojo.Mate;
import com.population.service.MateService;
import com.population.util.ReturnUtil;
import com.population.vo.MateVO;
import com.population.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MateServiceImpl implements MateService {
    @Autowired
    private MateDaoMapper mateDaoMapper;
    @Override
    public Mate findOndMate(Integer userId) {
        return mateDaoMapper.selectMate(userId);
    }

    @Override
    public List<MateVO> findAllMate() {
        return null;
    }

    @Override
    public Message changeMate(Mate mate) {
        Integer num = mateDaoMapper.updateMate(mate);
        Message message = ReturnUtil.returnDataOperation("修改", num);
        return message;
    }

    @Override
    public Message removeMateByUpdate(Integer maId) {
        Integer num = mateDaoMapper.delMateByUpdate(maId);
        Message message = ReturnUtil.returnDataOperation("删除", num);
        return message;
    }

    @Override
    public Message addMate(Mate mate) {
        Integer num = mateDaoMapper.insertMate(mate);
        Message message = ReturnUtil.returnDataOperation("添加", num);
        return message;
    }
}
