package com.jeff.ioc.life;

public class Person {

    private Integer id;

    private String sex;

    private String name;

    public Person() {
        System.out.println("One: create Object");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println("Two: Dependency Injection");
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("Three: intialize");
    }

    @Override
    public String toString() {
        return "Four: Person{" +
                "id=" + id +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void destory(){
        System.out.println("Five: destory");
    }

}
