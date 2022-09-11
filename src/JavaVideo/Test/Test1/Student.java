package JavaVideo.Test.Test1;

import Study_java_Problem.Teacher;

import java.util.Objects;

public class Student {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (flag != student.flag) return false;
        return Objects.equals(name, student.name);
    }


}

