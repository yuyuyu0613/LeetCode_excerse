package JavaVideo;

import Study_java_Problem.Teacher;

public class Student extends Teacher {
    public int age;
    public int flag;
    private String name;
    public Student(){

    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void function(){
        System.out.println("study");

    }

}
