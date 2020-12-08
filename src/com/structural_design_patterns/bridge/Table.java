package com.structural_design_patterns.bridge;
import com.behavioral_design_patterns.command.Command;

import java.util.ArrayList;
import java.util.List;

public class Table extends Place {


    List<Command> buttons = new ArrayList<Command>(10);
    Command lastCommand;
    List<Command> commandSet = new ArrayList<Command>(3);

    public Table(PlaceType placeType) {
        super(placeType);
    }

    public Table() {

    }
    @Override
    public void arrange() {
        System.out.println("Your table is arranged!");
        placeType.set();
    }

    public List<Command> getCommandSet() {
        return commandSet;
    }

    public Command getLastCommand() {
        return lastCommand;
    }

    public void setLastCommand(Command lastCommand) {
        this.lastCommand = lastCommand;
    }

    public void setCommandOnButton( int i,Command cmd) {
        buttons.add(i, cmd);
    }

    public void buttonPress(int buttonNumber){
        Command command = buttons.get(buttonNumber);
        command.start();
        setLastCommand(command);
        commandSet.add(command);
    }
}
