package com.population.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message {

    //ID号码
    private Integer xyId;

    //判断标识
    private boolean estimate;

    //提示语句
    private String slogan;

    //修改了多少条语句
    private Integer count;

}
