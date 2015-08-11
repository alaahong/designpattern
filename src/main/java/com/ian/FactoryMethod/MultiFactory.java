package com.ian.FactoryMethod;

import com.ian.FactoryMethod.impl.MailSneder;
import com.ian.FactoryMethod.impl.SmsSender;

/**
 * Created by Ian on 02/06/2015.
 */
public class MultiFactory {
    public String produceMail() {
        return new MailSneder().send();
    }

    public String produceSms() {
        return new SmsSender().send();
    }
}
