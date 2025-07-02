public class Student1 {
    int studentId;
    String name;
    double[] grades;

    double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public static void main(String[] args) {
        Student1 s = new Student1();
        s.studentId = 1001;
        s.name = "Emma";
        s.grades = new double[]{85.5, 90.0, 88.5};
        System.out.println("Average Grade: " + s.calculateAverage());
    }
}
