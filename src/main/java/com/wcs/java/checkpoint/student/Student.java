package com.wcs.java.checkpoint.student;

import java.sql.Date;

public class Student {

    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private int number;

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    static boolean hasLegalAge(int age){
        if ( age >= 18 ) { return true; } else { return false;}
    }

    static  char getGroup(int number){
        if ( (number % 2) == 0 ) { return 'A'; } else { return 'B';}
    }

    static int countStudents(String[] arrayLang){
        int numberStudentsInJava = 0;

        for (int i=0 ; i < arrayLang.length ; i++){
            String language = arrayLang[i].toUpperCase().trim();
            if ( language.equals("JAVA") ) { numberStudentsInJava++; }
        }

        return numberStudentsInJava;
    }
}





