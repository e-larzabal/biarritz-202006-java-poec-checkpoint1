package com.wcs.java.checkpoint.student;

import java.sql.Date;

public class Student {

    private long id;
    private String firstName;
    private String lastName;
    private int age;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static boolean hasLegalAge(int age){
        if ( age >= 18 ) { return true; } else { return false;}
    }
}





