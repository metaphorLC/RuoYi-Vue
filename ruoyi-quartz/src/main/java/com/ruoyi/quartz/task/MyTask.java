package com.ruoyi.quartz.task;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @version 1.0.0
 * @program: RuoYi-Vue
 * @className: MyTask
 * @description:
 * @author: Lin
 * @create: 2025/7/24 07:46
 **/
@Component
public class MyTask {

    public void showTime() {
        System.out.println("定时任务开始执行: " + new Date());
    }
}