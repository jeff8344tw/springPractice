package com.jeff.ioc.auto;

public class Dept implements DeptInterface{

    private Integer dId;

    private String dName;

    @Override
    public String toString() {
        return "Dept{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                '}';
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }
}
