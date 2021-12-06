package com.itp.final2020;

public class UniversityMember {
    private String name;
    private int age;
    private Sex sex;

    public UniversityMember() {
    }

    public UniversityMember(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String toString() {
        return String.format("Student{name: %s, age: %d, sex: %s}",
                name, age, sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

}
