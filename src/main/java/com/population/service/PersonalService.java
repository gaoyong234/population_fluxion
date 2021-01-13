package com.population.service;

import com.population.pojo.personal;

public interface PersonalService {
    Integer inserPersonal(personal personal);

    personal findUser(Integer userId);

    Integer updatePersonal(personal personal);

    Integer findPersonalIdByUserId(Integer userId);
}
