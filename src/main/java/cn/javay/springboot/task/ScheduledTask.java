package cn.javay.springboot.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

    @Scheduled(cron = "0 0/5 * * * ?")
    public void test() {
        System.out.println("task");
    }

}
