package com.logger.logger.interfaces;

import com.logger.logger.enums.Level;

public interface Logger {

    void setLevel(Level level);
    void debug(String msg);
    void error(String msg);
    void warn(String msg);
    void fatal(String msg);
    void info(String msg);



}
