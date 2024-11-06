package com.buffer.mqpatterns.p114;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.buffer.mqpatterns.p114.global.Constants;
import com.buffer.mqpatterns.p114.global.OurData;

@Component
@EnableScheduling
public class Scheduler114 {
    protected final Log logger = LogFactory.getLog(getClass());

    private final SendMessageService114 service;
    static private int i = 0;

    Scheduler114(SendMessageService114 service) {
        this.service = service;
    }

    @Scheduled(initialDelay = 55 * Constants.SECOND, fixedRate = 1 * Constants.MINUTE)
    public void run() {
        String greeting = "Sending data in cycle :" + i++;
        OurData msg1 = new OurData(greeting);

        logger.info("");
        logger.info( this.getClass().getSimpleName());
        logger.info("Sending messages");

        logger.info(msg1);
        service.send(msg1);
    }
}