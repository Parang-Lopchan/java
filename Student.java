public class Student {
    String name;
    int rollno;
    int age;

    Student(String n, int r, int a){
        name = n;
        rollno = r;
        age = a;
    }

    public static void main(String[] args) {
        Student p1 = new Student("Umesh tamang", 3, 23);

        System.out.println("Student details");
        System.out.println("Name:"+p1.name);
        System.out.println("Age:"+p1.age);
        System.out.println("Roll no:"+p1.rollno);
    }
}
