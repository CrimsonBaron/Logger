package com.logger.logger;

import com.logger.logger.enums.Level;
import com.logger.logger.interfaces.Logger;

public class ConsoleLogger implements Logger {

    Level level;
    Format format = new Format();

    ///debug-----------------------------------
    String time = "9:27";

    //


    @Override
    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public void debug(String msg) {
        if (level == Level.ALL || level == Level.DEBUG){
            format.setMsg(msg);
            System.out.println(format.getFormat());
        }
    }

    @Override
    public void error(String msg) {
        if (level == Level.ALL || level == Level.ERROR){
            format.setMsg(msg);
            System.out.println(format.getFormat());
        }
    }

    @Override
    public void warn(String msg) {
        if (level == Level.ALL || level == Level.WARN){
            format.setMsg(msg);
            System.out.println(format.getFormat());
        }
    }

    @Override
    public void fatal(String msg) {
        if (level == Level.ALL || level == Level.FATAL){
            format.setMsg(msg);
            System.out.println(format.getFormat());
        }
    }

    @Override
    public void info(String msg) {
        if (level == Level.ALL || level == Level.INFO){
            format.setMsg(msg);
            System.out.println(format.getFormat());
        }
    }
}
