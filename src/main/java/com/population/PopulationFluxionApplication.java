package com.population;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.population.dao")
public class PopulationFluxionApplication {

    public static void main(String[] args) {
        SpringApplication.run(PopulationFluxionApplication.class, args);
        System.out.println("启动");

    }

}
