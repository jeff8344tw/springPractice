package com.jeff.ioc.auto;

public class Emp {

    private Integer eId;

    private String eName;

    private CarExtends car;

    @Override
    public String toString() {
        return "Emp{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", car=" + car +
                ", dept=" + dept +
                '}';
    }

    public void setCar(CarExtends car) {
        this.car = car;
    }

    private DeptInterface dept;

    public void setCar(Car car) {
        this.car = car;
    }


    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public CarExtends getCar() {
        return car;
    }

    public DeptInterface getDept() {
        return dept;
    }

    public void setDept(DeptInterface dept) {
        this.dept = dept;
    }
}
