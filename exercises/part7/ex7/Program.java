package part7.ex7;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //main program code, starts execution of a new UI
        Scanner scanner = new Scanner(System.in);
        UserInterface UI = new UserInterface(scanner);
        UI.start();
    }
}
