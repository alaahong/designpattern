package com.ian.FactoryMethod;

import com.ian.FactoryMethod.impl.MailSneder;
import com.ian.FactoryMethod.impl.SmsSender;

/**
 * Created by Ian on 02/06/2015.
 */
public class SimpleFactory {
    public String produce(String type) {
        if ("m".equals(type)) {
            return new MailSneder().send();
        } else if ("s".equals(type)) {
            return new SmsSender().send();
        } else {
            System.out.println("No matching type!");
            return null;
        }
    }
}
