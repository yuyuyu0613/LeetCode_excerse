package JavaVideo.Test.Test1;

public class Demo {
    public static void main (String[] args){
        Student student= new Student(23,"u") {
            public String toString() {
                return "age:" + getAge() + "  name:" + getName();

            }
        };
        System.out.println(student);

    }
}
