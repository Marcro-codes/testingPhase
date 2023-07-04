package com.Bank.userManagement;

public class Student {
    private String name;
    private int no;
    private String state;

    public Student(String name, int no, String state) {
        this.name = name;
        this.no = no;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}