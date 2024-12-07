package com.klef.jfsd.beans;

public class StudentSI {
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getSfee() {
        return sfee;
    }

    public void setSfee(double sfee) {
        this.sfee = sfee;
    }

    private int sid;
    private String sname;
    private double sfee;
}
