package com.population.dao;

import com.population.pojo.Dic;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dic record);

    int insertSelective(Dic record);

    Dic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dic record);

    int updateByPrimaryKey(Dic record);

    List<Dic> findAll();

}