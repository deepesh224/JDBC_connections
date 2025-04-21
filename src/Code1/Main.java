package Code1;
import java.util.Scanner;

class Student {
    String studentName;
    int[] marks = new int[3];

    public void inputStudentInfo() {
        Scanner scanner = new Scanner(System.in);

        // Correct prompt format
        System.out.println("Enter name:");
        studentName = scanner.nextLine();

        System.out.println("Enter marks for three subjects:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + ":");
            marks[i] = scanner.nextInt();
        }
    }
}

class GradeCalculator extends Student {
    double averageGrade;

    public void calculateAverageGrade() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        averageGrade = sum / 3.0;

        // Ensuring correct format
        System.out.printf("Average Grade for %s: %.2f%n", studentName, averageGrade);
    }
}

public class Main {
    public static void main(String[] args) {
        GradeCalculator gradeCalculator = new GradeCalculator();
        gradeCalculator.inputStudentInfo();
        gradeCalculator.calculateAverageGrade();
    }
}