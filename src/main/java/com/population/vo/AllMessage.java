package com.population.vo;

import com.population.pojo.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AllMessage {

    //用户个人信息
    private personal personal;
    //配偶信息
    private Mate mate;
    //同住家庭成员
    private List<FamilyVO> familyVOList;
    //计生信息
    private Child child;
    //就业信息
    private EmployingVO employingVO;
    //居住信息
    private DwellVO dwellVO;

}
