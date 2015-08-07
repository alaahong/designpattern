package com.ian.Command.impl;

import com.ian.Command.ICommand;
import com.ian.Command.Receiver;

/**
 * Created by Ian on 24/06/2015.
 */
public class Command implements ICommand {
    private Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String exec() {
        return receiver.action();
    }
}
