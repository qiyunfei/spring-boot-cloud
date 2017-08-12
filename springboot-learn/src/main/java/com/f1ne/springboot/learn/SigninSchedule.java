package com.f1ne.springboot.learn;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class SigninSchedule {
	private static final Logger logger = LoggerFactory.getLogger(SigninSchedule.class);
    
    /**
     * kfaka失败消息
     */
    public static final String REDIS_LOCK_FOR_CAMPAIGN_GROUPON_KAFKA_FAIL_MSG = "campaignSigninKafkaFailMsg";
    
    private static final  SimpleDateFormat  DF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 默认时延时间
     */
    private static final Long DEFUALT_DELAY_UNLOCK_TIME = 1000L;//1s


    @Scheduled(cron="*/6 * * * * ?")
    public void testSchedule(){
        logger.info("测试定时任务 当前时间：{}", DF.format(new Date()));

    }
    @Scheduled(cron="*/6 * * * * ?")
    public void testSchedule2(){
        logger.info("测试定时任务 当前时间：{}", DF.format(new Date()));

    }
    @Scheduled(cron="*/6 * * * * ?")
    public void testSchedule3(){
        logger.info("测试定时任务 当前时间：{}", DF.format(new Date()));

    }
}
