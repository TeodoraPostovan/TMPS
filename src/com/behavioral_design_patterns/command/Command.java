package com.behavioral_design_patterns.command;
import com.structural_design_patterns.bridge.Table;


import javax.swing.text.TabExpander;
import java.util.Arrays;
import java.util.List;

public interface Command {
    public void start();
    public void stop();

}

class CommandHandler implements Command {
    List<Command> commandSet;
    public CommandHandler(Command... commands){
        commandSet = Arrays.asList(commands);
    }

    @Override
    public void start() {
        for (Command cmd : commandSet) {
            System.out.println("Click " + cmd.getClass().getSimpleName());
            cmd.start();
        }
    }

    @Override
    public void stop() {

    }
}

class StopCommandSet implements Command {

    Table table;
    public StopCommandSet (Table Command){
        this.table = Command;
    }

    @Override
    public void start() {
        for (Command cmd : table.getCommandSet()){
            System.out.println("Stop" + cmd.getClass().getSimpleName());
            cmd.stop();
        }
    }

    @Override
    public void stop() {
        for(Command cmd : table.getCommandSet() )
            cmd.stop();
    }
}

class StopCommand implements Command{
    Command Lastcommand;
    Table table;

    public StopCommand(Table Command){
        this.table = Command;
    }

    @Override
    public void start() {
        System.out.println(table.getLastCommand());
        table.getLastCommand().stop();
    }
    @Override
    public void stop() {
        table.getLastCommand().stop();
    }
}


class LightON implements Command{
    Light light;
    public LightON(Light light){
        this.light = light;
    }
    @Override
    public void start() {
        light.turnON();
    }

    @Override
    public void stop() {
        light.turnOFF();
    }
}

class LightOFF implements Command{
    Light light;
    public LightOFF(Light light){
        this.light = light;
    }
    @Override
    public void start() {
        light.turnOFF();
    }

    @Override
    public void stop() {
        light.turnON();
    }
}

class TvON implements Command{
    Tv device;
    public TvON(Tv device){
        this.device = device;
    }
    @Override
    public void start() {
        device.turnON();
    }

    @Override
    public void stop() {
        device.turnOFF();
    }
}

class TvOFF implements Command{
    Tv device;
    public TvOFF(Tv device){
        this.device = device;
    }
    @Override
    public void start() {
        device.turnOFF();
    }

    @Override
    public void stop() {
        device.turnON();
    }
}




class MusicON implements Command{
    MusicSystem device;
    public MusicON(MusicSystem device){
        this.device = device;
    }
    @Override
    public void start() {
        device.turnON();
    }

    @Override
    public void stop() {
        device.turnOFF();
    }
}

class MusicOFF implements Command{
    MusicSystem device;
    public MusicOFF(MusicSystem device){
        this.device = device;
    }
    @Override
    public void start() {
        device.turnOFF();
    }

    @Override
    public void stop() {
        device.turnON();
    }
}
class MusicVolumeUP implements Command{
    MusicSystem device;
    public MusicVolumeUP(MusicSystem device){
        this.device = device;
    }
    @Override
    public void start() { device.volumeUP(); }

    @Override
    public void stop() {
        device.volumeDOWN();
    }
}
class MusicVolumeDown implements Command{
    MusicSystem device;
    public MusicVolumeDown(MusicSystem device){
        this.device = device;
    }
    @Override
    public void start() {
        device.volumeDOWN();
    }

    @Override
    public void stop() {
        device.volumeUP();
    }
}
