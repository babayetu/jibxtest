package com.vip.jibx;

/**
 * Created by jjliu on 2017/3/18.
 */
public class Account {
    private int id;
    private String name;
    private String email;
    private String address;
    private Birthday birthday;
    //getter、setter

    @Override
    public String toString() {
        return this.id + "#" + this.name + "#" + this.email + "#" + this.address + "#" + this.birthday;
    }
}
