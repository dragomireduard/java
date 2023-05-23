package part7.ex6;

import java.util.Scanner;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        GradeBook gradeBook = new GradeBook();

        Interface txtInterface = new Interface(scanner, gradeBook);
        txtInterface.start();
    }


}

