package part5.ex10;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> listOfBooks = new ArrayList<>();

    while (true){
        System.out.println("Name (empty will stop):");
        String name = scanner.nextLine();
        if(name.isEmpty()){
            break;
        }
        System.out.println("Publication year:");
        int year = Integer.valueOf(scanner.nextLine());

        Book auxiliarBook = new Book(name , year);
        int ok=1;
        for (Book iterator : listOfBooks){
            if(iterator.equals(auxiliarBook)){
                 ok=0;
            }
        }
        if(ok == 1){
            listOfBooks.add(auxiliarBook);
        }else {
            System.out.println("The book is already on the list. Let's not add the same book again.");
        }


    }
        System.out.println("Thank you! Books added: " + listOfBooks.size());
    }
}
