package part6.ex10;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList list = new TodoList();

        UserInterface userInterface = new UserInterface(list , scanner);

        userInterface.start();

    }
}
