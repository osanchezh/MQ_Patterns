package com.buffer.mqpatterns.p114.global;

import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Session;


//import com.ibm.mq.jakarta.jms.MQDestination;
//import com.ibm.mq.samples.jms.spring.globals.Constants;
//import com.ibm.msg.client.jakarta.wmq.WMQConstants;
import org.springframework.jms.support.destination.DestinationResolver;

import com.ibm.mq.jms.MQDestination;
import com.ibm.msg.client.wmq.WMQConstants;

//import jakarta.jms.DeliveryMode;
//import jakarta.jms.Destination;
//import jakarta.jms.JMSException;
//import jakarta.jms.Session;

public class OurDestinationResolver implements DestinationResolver {
    @Override
    public Destination resolveDestinationName(Session session, String dest, boolean pubSub) throws JMSException {
        Destination destination = null;

        if (pubSub) {
            destination = session.createTopic(dest);
        } else {
            destination = session.createQueue(dest);
        }

        MQDestination mqDestination = (MQDestination) destination;
        mqDestination.setTargetClient(WMQConstants.WMQ_CLIENT_NONJMS_MQ);

        if (dest.startsWith(Constants.TEMPQUEUEPREFIX)) {
            mqDestination.setPersistence(DeliveryMode.NON_PERSISTENT);
        }

        return destination;
    }
}