package com.logger.logger;

import com.logger.logger.enums.Level;
import com.logger.logger.interfaces.Format;
import com.logger.logger.interfaces.Logger;

public class LoggerWrapper implements Logger {


    private Logger[] loggers={new ConsoleLogger(),new FileLogger()};
    com.logger.logger.Format format = new com.logger.logger.Format();

    @Override
    public void setLevel(Level level) {
        for(Logger l : loggers){
            l.setFormat(format);
            l.setLevel(level);
        }
    }

    @Override
    public Format getFormat() {

        return format;
    }

    @Override
    public void debug(String msg) {
        for(Logger l : loggers){
            l.setFormat(format);
            l.debug(msg);
        }
    }

    @Override
    public void error(String msg) {
        for(Logger l : loggers){
            l.setFormat(format);
            l.error(msg);
        }

    }

    @Override
    public void warn(String msg) {
        for(Logger l : loggers){
            l.setFormat(format);
            l.warn(msg);
        }

    }

    @Override
    public void fatal(String msg) {
        for(Logger l : loggers){
            l.setFormat(format);
            l.fatal(msg);
        }

    }

    @Override
    public void info(String msg) {
        for(Logger l : loggers){
            l.setFormat(format);
            l.info(msg);
        }

    }

    @Override
    public void setFormat(com.logger.logger.Format format) {
        this.format = format;
    }
}
