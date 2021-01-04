package com.population.dao.DicDao;

import com.population.pojo.Dic;

import java.util.List;

public interface DicDaoMapper {
    List<Dic> selectDicByParentId(Integer parentId);
}
