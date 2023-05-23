package part6.ex10;

import java.util.Scanner;

public class UserInterface {
    private TodoList taskList;
    private Scanner scanner;

    public UserInterface(TodoList taskList , Scanner scanner){
        this.taskList=taskList;
        this.scanner=scanner;
    }

    public void start(){
        while (true){
            System.out.println("Command: ");
            String command = scanner.nextLine();

            switch (command){
                case "stop":
                    return;
                case "add":
                    System.out.println("To add: ");
                    String addObject = scanner.nextLine();
                    taskList.add(addObject);
                    break;
                case "list":
                    taskList.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    int index = Integer.valueOf(scanner.nextLine());
                    taskList.remove(index);
                    break;
                default:
                    System.out.println("Unknown command!");
            }
        }
    }
}
