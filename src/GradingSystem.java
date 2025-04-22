import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();
        String grade;

        if (marks >= 90 && marks <= 100) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else if (marks >= 0) {
            grade = "F";
        } else {
            grade = "Invalid Input";
        }

        System.out.println("Grade: " + grade);
    }
}





