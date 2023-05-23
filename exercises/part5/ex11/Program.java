package part5.ex11;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    ArrayList<Item> archive = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true){
        System.out.println("Identifier? (empty will stop)");
        String identifier = scanner.nextLine();
        if(identifier.isEmpty()){
            break;
        }
        System.out.println("Name? (empty will stop)");
        String name = scanner.nextLine();
        if(name.isEmpty()){
            break;
        }
        Item auxiliarItem = new Item(identifier,name);
        if (archive.contains(auxiliarItem)) {

            System.out.println("Already on list");

        } else {
            archive.add(auxiliarItem);
        }
    }
        System.out.println("==Items==");
    for(Item iterator : archive){
        System.out.println(iterator);
    }
    }
}
