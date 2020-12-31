package com.population.dao;

import com.population.pojo.Dic;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

public interface DicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dic record);

    int insertSelective(Dic record);

    Dic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dic record);

    int updateByPrimaryKey(Dic record);

    List<Dic> findAll();

}