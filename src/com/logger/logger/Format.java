package com.logger.logger;

public class Format implements com.logger.logger.interfaces.Format {
    private String format;
    private String mainFormat;
    private String msg;
    private String date;

    @Override
    public void setFormat(String format) {
        this.format = String.format(mainFormat,this.msg);
    }

    @Override
    public void setFormat(String format, String date) {
        this.format = String.format(mainFormat,msg,date);

    }

    @Override
    public void setFormat(String format, String date, String loc) {
        this.format = String.format(mainFormat,msg,date,loc);

    }

    @Override
    public String getFormat() {
        return this.format;
    }

    @Override
    public void setMsg(String msg) {
        this.msg = msg;

    }

    @Override
    public void setMainFormat(String format) {
        this.mainFormat = format;
    }


    public Format() {
    }
}
