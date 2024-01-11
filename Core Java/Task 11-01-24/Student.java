public class Student {
    int sid;
    String name;
    int age;

    public Student(int sid) {
        this.sid = sid;
    }

    public Student(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    public Student(int sid, String name, int age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
    }

    public String toString(){
        String str = String.format("Student ID: %s \nStudent Name: %s \nStudent Age: %s\n",sid,name,age);
        return str;
    }
    
    public static void main(String[] args) {
        Student s1 = new Student(101);
        Student s2 = new Student(102, "Sameer");
        Student s3 = new Student(103, "Priya", 21);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
    
}
