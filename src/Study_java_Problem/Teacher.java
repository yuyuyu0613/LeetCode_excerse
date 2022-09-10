package Study_java_Problem;

public class Teacher {
 private String name;
    public int flag;
 public int age;

    public Teacher() {
        System.out.println("test father on");

    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("test father two");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void behavior(){
        System.out.println("play game");

    }
}
