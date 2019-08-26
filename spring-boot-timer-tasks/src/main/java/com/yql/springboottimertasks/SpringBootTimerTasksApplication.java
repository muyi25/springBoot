package com.yql.springboottimertasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

//开启定时任务
@EnableScheduling
@SpringBootApplication
public class SpringBootTimerTasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTimerTasksApplication.class, args);
    }

}
