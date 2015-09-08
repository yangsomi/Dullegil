package edu.rapa.iot.dullegilapp.model;

import java.util.Date;

/**
 * Created by skplanet on 2015-09-07.
 */
public class Stamp {
    private int checking;
    private Date date;
    private int stamp_id;
    private int user_id;
    private NFCTag tag;

    public Stamp(int checking, Date date, int stamp_id, int user_id, NFCTag tag) {
        this.checking = checking;
        this.date = date;
        this.stamp_id = stamp_id;
        this.user_id = user_id;
        this.tag = tag;
    }

    public int getChecking() {
        return checking;
    }

    public void setChecking(int checking) {
        this.checking = checking;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStamp_id() {
        return stamp_id;
    }

    public void setStamp_id(int stamp_id) {
        this.stamp_id = stamp_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public NFCTag getTag() {
        return tag;
    }

    public void setTag(NFCTag tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "checking=" + checking +
                ", date=" + date +
                ", stamp_id=" + stamp_id +
                ", user_id=" + user_id +
                ", tag=" + tag +
                '}';
    }
}
