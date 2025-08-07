public class Main{
    public static void main(String[]args){

        System.out.println("\nStudent Information:");

        Student student1 = new Student
                ("Johnden",
                20,
                "BSIT",
                50,
                50,
                50);
        student1.displayInfo();
        student1.calculateAverage();
        student1.getLetterGrade();
        student1.isPassing();

        Student student2 = new Student
                ("Ashton",
                20,
                "BSIT",
                20,
                20,
                20);
        student2.displayInfo();
        student2.calculateAverage();
        student2.getLetterGrade();
        student2.isPassing();

        Student student3 = new Student
                ("Alice",
                20,
                "BSIT",
                50,
                50,
                50);
        student3.displayInfo();
        student3.calculateAverage();
        student3.getLetterGrade();
        student3.isPassing();

        System.out.println("\nSummary: " + Student.passingStudents + " out of " + Student.totalStudent + " students are passing");
    }
}