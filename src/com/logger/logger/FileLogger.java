package com.logger.logger;

import com.logger.logger.enums.Level;
import com.logger.logger.interfaces.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileLogger implements Logger {
    Level level;
    Format format = new Format();

    File file = new File("log.txt");
    FileWriter writer;

    {
        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public FileLogger() {
    }

    @Override
    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public com.logger.logger.interfaces.Format getFormat() {
        return format;
    }

    @Override
    public void debug(String msg) {
        if (level == Level.ALL || level == Level.DEBUG) {
            format.setMsg(msg);
            format.setFormat(format.getFormat());
            try {
                writer.write(format.getFormat() + "\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void error(String msg) {
        if (level == Level.ALL || level == Level.ERROR) {
            format.setMsg(msg);
            format.setFormat(format.getFormat());
            try {
                writer.write(format.getFormat() + "\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void warn(String msg) {
        if (level == Level.ALL || level == Level.WARN) {
            format.setMsg(msg);
            format.setFormat(format.getFormat());
            try {
                writer.write(format.getFormat() + "\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void fatal(String msg) {
        if (level == Level.ALL || level == Level.FATAL) {
            format.setMsg(msg);
            format.setFormat(format.getFormat());
            try {
                writer.write(format.getFormat() + "\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void info(String msg) {
        if (level == Level.ALL || level == Level.INFO) {
            format.setMsg(msg);
            format.setFormat(format.getFormat());
            try {
                writer.write(format.getFormat() + "\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
