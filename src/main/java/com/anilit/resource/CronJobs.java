package com.anilit.resource;

import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CronJobs {

    @Scheduled(every = "10s")
    public void executeEvery10s(){
        System.out.println("I am cron jobs...!");
    }

    @Scheduled(cron = "0 6 12 * * ?")
    public void executeEveryDay(){
        System.out.println("I am executing cron job at 12:6 pm");
    }

}
