package part7.ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }
        System.out.println(books.get(0));
        System.out.println(binarySearch(books , 2));
    }

    public static int linearSearch(ArrayList<Book> books , int searchedId){
        int index =0 , foundIndex=-1;
        for (Book book: books){
            if(book.getId() == searchedId){
                foundIndex = index;
            }
            index++;
        }
        return  foundIndex;
    }

    public static int binarySearch(ArrayList<Book> books , long searchedId){
        int first = 0 ;
        int last = books.size()-1;

        while(first<last){
            int middle = (first+last) / 2;
            if(books.get(middle).getId()== searchedId){
                return middle;
            }else{
                if(books.get(middle).getId()<searchedId){
                    last = middle+1;
                } else if (books.get(middle).getId()>searchedId) {
                    last = middle-1;
                }
            }
        }
        return -1;
    }

    public static int binarySearch2(ArrayList<Book> books, long searchedId) {
        //indexes

        int first = 0;
        int last = books.size() - 1;

        int foundIndex = -1;

//break statement is very important otherqise it just keeps looping infinitely
//or you could just use return. I find 1 return statment a bit easier to read
        while (first <= last) {

            int middle = (first + last) / 2;

            if (books.get(middle).getId() == searchedId) {

                foundIndex = middle;
                break;
            } else if (books.get(middle).getId() < searchedId) {
                first = middle + 1;
            } else if (books.get(middle).getId() > searchedId) {
                last = middle - 1;
            }

        }

        return foundIndex;

    }
}
