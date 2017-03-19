package com.vip.jibx;

/**
 * Created by jjliu on 2017/3/18.
 */
public class Birthday {
    private String birthday;

    public Birthday(String birthday) {
        this.birthday = birthday;
    }

    public Birthday() {}

    @Override
    public String toString() {
        return this.birthday;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
