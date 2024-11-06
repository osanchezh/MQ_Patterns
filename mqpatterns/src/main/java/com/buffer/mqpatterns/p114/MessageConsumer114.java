package com.buffer.mqpatterns.p114;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.buffer.mqpatterns.p114.global.OurData;

@Component
public class MessageConsumer114 {
    protected final Log logger = LogFactory.getLog(getClass());

    @JmsListener(destination = "DEV.QUEUE.1", containerFactory = "myContainerFactory114")
    public void receiveRequest(OurData message) {
        logger.info("");
        logger.info( this.getClass().getSimpleName());
        logger.info("Received message of type: " + message.getClass().getSimpleName());
        logger.info("Received message :" + message);
    }
}