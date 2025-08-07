public class Student {
    String name = "";
    int age = 0;
    String course = "";
    double grade1 = 0;
    double grade2 = 0;
    double grade3 = 0;

    static int totalStudent =0;
    static int passingStudents = 0;

    public Student(String studentName,int studentAge,String studentCourse,double studentGrade1, double studentGrade2, double studentGrade3){
        name = studentName;
        age = studentAge;
        course = studentCourse;
        grade1 = studentGrade1;
        grade2 = studentGrade2;
        grade3 = studentGrade3;
        totalStudent += 1;

    }

    void displayInfo(){
        System.out.println("\nName: " + name + ", Age: " + age + ", Course: " + course);
        System.out.println("Grades: " + grade1 + ", " + grade2 + ", " + grade3);

    }

    void calculateAverage(){
        double average = grade1 + grade2 + grade3 / 300.0 * 100;
        System.out.println("Average: " + average);
    }

    void getLetterGrade(){
        double average = grade1 + grade2 + grade3 / 300.0 * 100;
        if (average >= 90){
            System.out.println("Letter Grade: A");
        } else if (average >= 80) {
            System.out.println("Letter Grade: B");
        } else if(average >= 70){
            System.out.println("Letter Grade: C");
        } else if(average >= 60){
            System.out.println("Letter Grade: D");
        } else  {
            System.out.println("Letter Grade: F");
        }
    }

    void isPassing(){
        double average = grade1 + grade2 + grade3 / 300.0 * 100;
        if (average >= 70){
            System.out.println("STATUS: PASSING");
            passingStudents += 1;
        } else {
            System.out.println("STATUS: FAILING");
        }
    }


}
