import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        System.out.print("Enter Section: ");
        String section = scanner.nextLine();

        System.out.println("\nStudent ID: " + studentID);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        System.out.print("\nEnter Midterm Exam Score: ");
        int midtermExamScore = scanner.nextInt();
        System.out.print("Enter Final Exam Score: ");
        int finalExamScore = scanner.nextInt();
        System.out.print("Enter Project Score: ");
        int projectScore = scanner.nextInt();
        System.out.print("Enter Attendance Score: ");
        int attendanceScore = scanner.nextInt();

        int averageScore = midtermExamScore + finalExamScore + projectScore + attendanceScore;
        double allOverScore = averageScore / 400.0 * 100;

        System.out.println("\nSTUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermExamScore);
        System.out.println("Final Exam Score: " + finalExamScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Score: " + attendanceScore);
        System.out.println("\nAverage Score: " + allOverScore);

        if (allOverScore < 75){
            System.out.println("Remarks: FAILED!");
        } else {
            System.out.println("Remarks: PASSED!");
        }

        scanner.close();
    }
}
