
    import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numSubjects = 0;
        int totalMarks = 0;
        double averagePercentage = 0.0;
        String grade = "";

        System.out.print("Enter the number of subjects: ");
        numSubjects = input.nextInt();

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = input.nextInt();
            totalMarks += marks;
        }

        averagePercentage = totalMarks / numSubjects;

        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C+";
        } else if (averagePercentage >= 40) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Total marks obtained: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}


