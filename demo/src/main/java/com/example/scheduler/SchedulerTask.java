package com.example.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <Description> 定时任务<br>
 *
 * @author xue.hairui<br>
 * @version 1.0<br>
 * @CreateDate 2019\7\28 0028 0:51 <br>
 * @since 1.0<br>
 */
@Component
public class SchedulerTask {

    private int count = 0;

    //@Scheduled(cron = "*/5 * * * * ?")
    private void process() {
        System.out.println("this is scheduler task running" + (count++));
    }

    //@Scheduled(fixedRate = 6000)
    private void process2() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("now date:" + sdf.format(new Date()));
    }

}
