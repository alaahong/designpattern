package com.ian.Command;

import com.ian.Command.impl.Command;

/**
 * Created by Ian on 24/06/2015.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public String action() {
        return command.exec();
    }
}
