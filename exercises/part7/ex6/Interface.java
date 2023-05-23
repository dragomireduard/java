package part7.ex6;

import java.util.Scanner;

public class Interface {
    private Scanner scanner;
    private GradeBook gradeBook;

    public Interface(Scanner scanner, GradeBook gradeBook) {

        this.gradeBook = gradeBook;
        this.scanner = scanner;

    }

    public void start() {

        boolean shouldLoop = true;

        System.out.println("Enter points total, -1 stops:");
        while (shouldLoop) {

            int gradePoint = Integer.valueOf(scanner.nextLine());

            if (gradePoint == -1) {

                gradeBook.printGrades();
                shouldLoop = false;

            } else{
                gradeBook.addGrade(gradePoint);
            }

        }

    }
}
