package JavaVideo;




import java.util.ArrayList;
import java.util.Scanner;

public class exercise_two {
    static ArrayList<Student> contain=new ArrayList<Student>();
    public static void main(String[] args) {
        studentManagementSystemInterface();


    }


    public static void studentManagementSystemInterface() {
        while (true) {
            System.out.println("welcome in management system");
            System.out.println("1 addStudent");
            System.out.println("2 deleteStudent");
            System.out.println("3 modificationStudent");
            System.out.println("4 look up ");
            System.out.println("5 exit");
            System.out.println("please choose");
            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();


            switch (line) {
                case "1":
                    System.out.println("1 addStudent");
                    addStudent(contain);
                    break;
                case "2":
                    System.out.println("2 addStudent");
                    deleteStudent(contain );
                    break;

                case "3":
                    System.out.println("3addStudent");
                    modifyStudent(contain);
                    break;
                case "4":
                    System.out.println("4 addStudent");
                    searchAllStudent(contain);
                    break;
                case "5":
                    System.out.println("5 addStudent");
                    System.exit(0);


            }
        }
    }

    public static void addStudent( ArrayList<Student> a) {

        Scanner sc = new Scanner(System.in);
        System.out.println("name");
        String name = sc.nextLine();
        System.out.println("age");
        int age = sc.nextInt();

        Student student = new Student(age, name);
        a.add(student);



    }
    public static void deleteStudent(ArrayList<Student> a){
        Scanner sc=new Scanner(System.in);
        System.out.println("please input deleted Student");
        String name=sc.nextLine();
        if(contain.size()==0)
        {
            System.out.println("null");
            return;
        }
        for(int j=0 ; j<contain.size(); j++){
            Student s=contain.get(j);
            if(s.getName().equals(name)){
                System.out.println(s.getName());
                contain.remove(j);
                System.out.println(s.getName());
                break;
            }

        }
    }
    public static void searchAllStudent(ArrayList<Student> contain){
        if(contain.size()==0)
        {
            System.out.println("no information");
        }
        for(Student s:contain){
            System.out.println(s.getAge()+"\t"+s.getName()+"\t");
        }

    }
    public static void modifyStudent(ArrayList<Student> contain){

        Scanner sc=new Scanner(System.in);
        System.out.println("please input student name");
        String a=sc.nextLine();
        System.out.println("please input name and age");
        int age=sc.nextInt();
        String name=sc.nextLine();
        for(int i=0;i<contain.size();i++){
            Student student=contain.get(i);
            if(student.getName().equals(a)){
                Student stud=new Student(age,name);
                contain.set(i,stud);

            }
        }
    }

}

