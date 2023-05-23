package part5.ex10;

public class Book {
    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compared) {
        if(compared == this){
            return true;
        }

        if(!(compared instanceof Book)){
            return false;
        }

        Book newBook = (Book) compared;

        if (this.name.equals(newBook.name) && this.publicationYear == newBook.publicationYear ){
            return true;
        }
        return false;

    }
}
