package com.jeff.spring.di;

import java.util.List;
import java.util.Map;

public class Teacher {
    private Integer tId;

    private String tName;

    private List<String> cls;

    private List<Student> students;

    private Map<String, String> bossMap;

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", cls=" + cls +
                ", students=" + students +
                ", bossMap=" + bossMap +
                '}';
    }

    public Map<String, String> getBossMap() {
        return bossMap;
    }

    public void setBossMap(Map<String, String> bossMap) {
        this.bossMap = bossMap;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<String> getCls() {
        return cls;
    }

    public void setCls(List<String> cls) {
        this.cls = cls;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }
}
