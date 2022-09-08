package Study_java_Problem;

public class Teacher {
 private String name;
 private int Age;

    public Teacher() {
        System.out.println("test father on");

    }

    public Teacher(String name, int age) {
        this.name = name;
        Age = age;
        System.out.println("test father two");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }
    public void behavior(){
        System.out.println("play game");

    }
}
