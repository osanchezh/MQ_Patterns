package com.buffer.mqpatterns.p114;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.buffer.mqpatterns.p114.global.OurData;
import com.buffer.mqpatterns.p114.global.OurMessageConverter;


@Service
public class SendMessageService114 {
    protected final Log logger = LogFactory.getLog(getClass());

    @Value("${app.l114.queue.name1}")
    public String sendQueue;

    final private JmsTemplate myNonJmsTemplate114;

    final private OurMessageConverter ourConverter = new OurMessageConverter();

    SendMessageService114(JmsTemplate myNonJmsTemplate114) {
        this.myNonJmsTemplate114 = myNonJmsTemplate114;
    }

    public void send(OurData msg) {
        logger.info("Sending Message");
       
        myNonJmsTemplate114.convertAndSend(sendQueue, msg);
//        myNonJmsTemplate114.send(sendQueue, new MessageCreator() {
//            @Override
//            public Message createMessage(Session session) throws JMSException {
//                Message jmsmsg = ourConverter.toMessage(msg, session);
//                return jmsmsg;
//            }
//        });
    }
}