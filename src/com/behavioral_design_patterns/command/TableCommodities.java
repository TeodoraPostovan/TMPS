package com.behavioral_design_patterns.command;
import com.structural_design_patterns.bridge.Table;

public class TableCommodities {
    Table table;

    public TableCommodities(Table table) {
        this.table = table;
    }

    public void load() {
        Light light = new Light ();
        Tv tv = new Tv();
        MusicSystem musicSystem = new MusicSystem();


        table.setCommandOnButton(0,new StopCommand(table));
        table.setCommandOnButton(1,new LightON(light));
        LightOFF lightOff = new LightOFF(light);
        table.setCommandOnButton(2,lightOff);
        table.setCommandOnButton(3,new TvON(tv));
        TvOFF tvOff = new TvOFF(tv);
        table.setCommandOnButton(4,tvOff);
        table.setCommandOnButton(5,new StopCommandSet(table));
        table.setCommandOnButton(6,new CommandHandler(lightOff, tvOff));
        MusicOFF musicOFF = new MusicOFF(musicSystem);
        table.setCommandOnButton(7, musicOFF);
        table.setCommandOnButton(8,new MusicON(musicSystem));
        table.setCommandOnButton(9,new MusicVolumeUP(musicSystem));
        table.setCommandOnButton(10,new MusicVolumeDown(musicSystem));
    }
}


class Light {
    void turnON() {
        System.out.println("Turn ON Light");
    }

    void turnOFF() {
        System.out.println("Turn OFF Light");
    }
}
class Tv {
    void turnON() {
        System.out.println("Turn ON the tv");
    }

    void turnOFF() {
        System.out.println("Turn OFF the tv");
    }
}



class MusicSystem {
    void turnON() {
        System.out.println("Turn ON Music System");
    }

    void turnOFF() {
        System.out.println("Turn OFF Music System");
    }
    void volumeUP() {
        System.out.println("Volume up Music System");
    }

    void volumeDOWN() {
        System.out.println("Volume down Music System");
    }
}

