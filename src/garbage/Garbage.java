package garbage;
class Student{

    String name;
    int age;

    String schoolName;

    public Student(){

    }

    public  Student(String name) {
        this.name = name;

    }

    public Student(int age){
        this.age = age;
    }


    public Student(String name, int age){
        this.name =  name;
        this.age = age;
    }


    public String toString() {
        return name  ;
    }



}
public class Garbage {
    public static void main(String[] args) {
        Student s1 = new Student("John");
        Student s2 = new Student("Anna");
        Student s3 = new Student("Bill");
        Student s4 = new Student();

        String str = "abc";

        int length = str.length();

        System.out.println(s1 + "--" + s2 + "--" + s3);
        s1 = s3;
        s3 = s2;
        s2 = null;
        System.out.println(s1 + "--" + s2 + "--" + s3);
    }



}

class Boys extends Student{

    public Boys(String name){
        super(name);
    }

}

