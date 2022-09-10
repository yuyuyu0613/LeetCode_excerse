package Study_java_Problem;

public class Student extends Teacher{
    private String name;

    public int age;

    public Student() {

        System.out.println("test son one");
        Teacher a=new Teacher();

    }

    ;

    Student(String name, int age) {
        super("teacher",12);
        this.name = name;
        this.age = age;
        System.out.println("test son two");
    }

    public Student(int i, String yu) {
    }

    ;

    public void setAge(int age) {
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

 // @Override
  //  public String toString() {
       //return  "Name:"+name+"Age:"+age;
  //  }
@Override
    public String toString() {
        return "Name:" + name + "Age:" + age;
    }
public  void behavior(){
    System.out.println("watch television");
}
public static void methodInsert(){
    System.out.println("methodDemo");
}
public void callFunction(){
    new Stranger1().run();
    }
}

