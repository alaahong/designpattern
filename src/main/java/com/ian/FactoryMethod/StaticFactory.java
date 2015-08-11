package com.ian.FactoryMethod;

import com.ian.FactoryMethod.impl.MailSneder;
import com.ian.FactoryMethod.impl.SmsSender;

/**
 * Created by Ian on 02/06/2015.
 */
public class StaticFactory {
    public static String produceMail() {
        return new MailSneder().send();
    }

    public static String produceSms() {
        return new SmsSender().send();
    }
}
