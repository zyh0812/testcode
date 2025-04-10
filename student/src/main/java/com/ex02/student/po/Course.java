package com.ex02.student.po;

public class Course {
    private int cno;
    private String cname;
    private int period;

    @Override
    public String toString() {
        return "Course{" +
                "cno=" + cno +
                ", cname='" + cname + '\'' +
                ", period=" + period +
                '}';
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Course(int cno, String cname, int period) {
        this.cno = cno;
        this.cname = cname;
        this.period = period;
    }
}
