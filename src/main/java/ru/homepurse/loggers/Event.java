package ru.homepurse.loggers;

import java.text.DateFormat;
import java.util.Date;

public class Event {
    public static int count;
    private int id;
    private String msg;
    private Date date;
    private DateFormat df;

    Event(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
        count++;
        this.id = count;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public DateFormat getDateFormat() {
        return df;
    }

    public void setDateFormat(DateFormat df) {
        this.df = df;
    }

    @Override
    public String toString() {
        return "Event{ date=" + df.format(date) +
                "id=" + id +
                ", msg='" + msg + '}';
    }
}
