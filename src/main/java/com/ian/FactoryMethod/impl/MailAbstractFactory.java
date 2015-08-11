package com.ian.FactoryMethod.impl;

import com.ian.FactoryMethod.IFactoryProvider;

/**
 * Created by Ian on 02/06/2015.
 */
public class MailAbstractFactory implements IFactoryProvider {
    @Override
    public String produce() {
        return "MailSender";
    }
}
