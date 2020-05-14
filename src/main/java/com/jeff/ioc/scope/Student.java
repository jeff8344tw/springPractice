package com.jeff.ioc.scope;

public class Student {

    private Integer sId;

    private String sName;

    public Student() {
        System.out.println("Student construct");
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
