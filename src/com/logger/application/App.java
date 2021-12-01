package com.logger.application;


import com.logger.logger.ConsoleLogger;
import com.logger.logger.FileLogger;
import com.logger.logger.enums.Level;
import com.logger.logger.interfaces.Logger;

public class App {
    public Logger logger = new FileLogger();
    public App() {

    }

   public void Run(String[] args){
        logger.getFormat().setMainFormat("msg -> %s");
        logger.setLevel(Level.ALL);

        logger.debug("nazdar");
        logger.error("errrrrrrrrrrrrrrrrrfrr");
        logger.warn("ajidna");


        //logger.end();

    }

}
