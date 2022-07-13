package com.koi.prototype.demo02;

import java.util.Date;

/**
 * @author koi
 * @date 2022/7/13 12:13
 */

public class Video implements Cloneable{
    private String title;
    private Date ctime;

    public Video() {
    }

    public Video(String title, Date ctime) {
        this.title = title;
        this.ctime = ctime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        Video v = (Video) clone;
        v.setCtime(this.ctime);
        return v;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
