package com.testSpring.jobservice;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class JobService02 {

    @Scheduled(cron = "0/3 * * * * ?")
    public void job(){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                .format(new Date()));
    }
    

}
