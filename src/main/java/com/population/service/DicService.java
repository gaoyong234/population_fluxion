package com.population.service;

import com.population.pojo.Dic;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DicService {
    List<Dic> findAll();
}
