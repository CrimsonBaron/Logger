package com.logger.logger.interfaces;

public interface Format {

    void setMsg(String msg);
    void setMainFormat(String format);
    void setFormat(String format);
    void setFormat(String format, String date);
    void setFormat(String format, String date, String loc);
    String getFormat();

}
