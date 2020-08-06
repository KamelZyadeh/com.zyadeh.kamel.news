package com.zyadeh.kamel.command;

import com.zyadeh.kamel.command.impl.HomeCommand;
import com.zyadeh.kamel.command.impl.LoginUserCommand;
import com.zyadeh.kamel.command.impl.RegisterUserCommand;
import com.zyadeh.kamel.service.impl.UserService;

public class CommandFactory {

    public static Command getCommand(String commandType) {


        switch (commandType) {
            case "command_register":
                return new RegisterUserCommand(new UserService());
            case "command_login":
                return new LoginUserCommand(new UserService());
            default:
                return new HomeCommand();
        }
    }
}
