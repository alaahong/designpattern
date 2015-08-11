package com.ian.FactoryMethod.impl;

import com.ian.FactoryMethod.ISender;

/**
 * Created by Ian on 02/06/2015.
 */
public class MailSneder implements ISender {
    @Override
    public String send() {
        return "MailSender";
    }
}
