package part6.ex9;

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner , SimpleDictionary dictionary){
        this.scanner=scanner;
        this.dictionary=dictionary;
    }
    public void start(){
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            switch (command){
                case "end":
                    System.out.println("Bye bye!");
                    return;
                case "add":
                    System.out.println("Word: ");
                    String word = scanner.nextLine();

                    System.out.println("Translation: ");
                    String translation = scanner.nextLine();

                    dictionary.add(word , translation);
                    break;
                case "search":
                    System.out.println("To be translated: ");
                    String translated= scanner.nextLine();

                    if(dictionary.translate((translated))!=null){
                        System.out.println("Translation: "+dictionary.translate(translated));

                    }else{
                        System.out.println("Word "+translated+" was not found");
                    }

                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
