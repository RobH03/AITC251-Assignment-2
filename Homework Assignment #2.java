#Robert Hicks AITC251
import java.util.Scanner;

public class Participation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get grades for assignments, final project, tests & quizzes, and participation
        System.out.print("Enter your grade for assignments (out of 100): ");
        double assignmentsGrade = scanner.nextDouble();

        System.out.print("Enter your grade for the final project (out of 100): ");
        double finalProjectGrade = scanner.nextDouble();

        System.out.print("Enter your grade for tests & quizzes (out of 100): ");
        double testsQuizzesGrade = scanner.nextDouble();

        System.out.print("Enter your grade for participation (out of 100): ");
        double participationGrade = scanner.nextDouble();

        // Calculate the weighted average
        double weightedAverage = (assignmentsGrade * 0.2) + (finalProjectGrade * 0.3) + (testsQuizzesGrade * 0.4) + (participationGrade * 0.1);

        // Determine the letter grade
        String letterGrade;
        if (weightedAverage >= 93) {
            letterGrade = "A";
        } else if (weightedAverage >= 90) {
            letterGrade = "A-";
        } else if (weightedAverage >= 87) {
            letterGrade = "B+";
        } else if (weightedAverage >= 83) {
            letterGrade = "B";
        } else if (weightedAverage >= 80) {
            letterGrade = "B-";
        } else if (weightedAverage >= 77) {
            letterGrade = "C+";
        } else if (weightedAverage >= 73) {
            letterGrade = "C";
        } else if (weightedAverage >= 70) {
            letterGrade = "C-";
        } else if (weightedAverage >= 67) {
            letterGrade = "D+";
        } else if (weightedAverage >= 63) {
            letterGrade = "D";
        } else if (weightedAverage >= 60) {
            letterGrade = "D-";
        } else {
            letterGrade = "F";
        }

        // Print the final grade
        System.out.println("Your final grade is: " + letterGrade);

        scanner.close();
    }
}
