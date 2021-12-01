package com.logger.logger;

public class Format implements com.logger.logger.interfaces.Format {
    String format;
    String msg;

    @Override
    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void setFormat(String format, String date) {

    }

    @Override
    public void setFormat(String format, String date, String loc) {

    }

    @Override
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String getFormat() {
        return format;
    }

    public Format() {
    }
}
