import java.util.Scanner;

public class IT26100768Lab9Q4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String[] studentNames = new String[5];
    char[] grades = new char[5];

    double[] assignMarks = new double[5];
    double[] paperMark = new double[5];
    double[] finalMarks = new double[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Enter name of Student " + (i + 1) + ": ");
      studentNames[i] = sc.next();

      System.out.print("Enter Assignment Mark (out of 100) for " + studentNames[i] + ": ");
      assignMarks[i] = sc.nextDouble();

      System.out.print("Enter Exam Paper Mark (out of 100) for " + studentNames[i] + ": ");
      paperMark[i] = sc.nextDouble();

      finalMarks[i] = calcFinalMark(assignMarks[i], paperMark[i]);
      grades[i] = findGrades(finalMarks[i]);

      System.out.println("");

    }
    System.out.print("Name\t\tFinal Mark\t\tGrade");
    System.out.println("");

    for (int i = 0; i < 5; i++) {

      printDetails(studentNames[i], finalMarks[i], grades[i]);
      System.out.println("");

    }

  }

  public static double calcFinalMark(double assignmentMark, double paperMark) {
    return (assignmentMark * 0.3) + (paperMark * 0.7);
  }

  public static char findGrades(double finalMark) {
    if (finalMark >= 75) {
      return 'A';
    } else if (finalMark >= 60 && finalMark < 75) {
      return 'B';
    } else if (finalMark >= 50 && finalMark < 60) {
      return 'C';
    } else {
      return 'F';
    }
  }

  public static void printDetails(String name, double finalMark, char grade) {
    System.out.print(name + "\t\t" + finalMark + "\t\t" + grade);
  }
}