package com.jeff.ioc.auto;

public class Car extends CarExtends {

    private Integer cId;

    private String cName;

    @Override
    public String toString() {
        return "Car{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                '}';
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }
}
