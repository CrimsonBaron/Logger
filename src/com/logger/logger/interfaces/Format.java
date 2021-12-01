package com.logger.logger.interfaces;

public interface Format {

    void setFormat(String format);
    void setFormat(String format, String date);
    void setFormat(String format, String date, String loc);

    void setMsg(String msg);
    String getFormat();

}
