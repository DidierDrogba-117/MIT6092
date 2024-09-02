public class Library {
    // Add the missing implementation to this class
    //  instance variables
    String address;
    Book[] books;
    int bookCnt = 0;

    // constructor
    public Library(String address) {
        this.address = address;
        this.books = new Book[10];
    }

    public void addBook(Book newBook) {
        this.books[bookCnt] = newBook;
        bookCnt++;
    }

    // this static method belongs to the class itself, rather than to instances
    // (objects) of the class
    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAddress() {
        System.out.println(this.address);
    }

    public void borrowBook(String bookName) {
        // corner case, check if this lib is null
        if (this.bookCnt == 0) {
            System.out.println("Sorry, this book is not in our catalog.");
            return;
        }
        // check if book in lib
        for (int i = 0; i < bookCnt; i++) {
            if (this.books[i].title.equals(bookName)) {
                if (!this.books[i].isBorrowed()) {
                    this.books[i].borrowed();
                    System.out.println("You successfully borrowed" + bookName);
                    return;
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                    return;
                }
            }
        }
        // doesn't find book in lib
        System.out.println("Sorry, this book is not in our catalog.");

    }

    public void printAvailableBooks() {
        if (this.bookCnt == 0) {
            System.out.println("No book in catalog");
            return;
        }
        for (int i = 0; i < bookCnt; i++) {
            System.out.println(this.books[i].getTitle());
        }

    }

    public void returnBook(String bookName) {
        // find this book in array, then update its status
        // check if book in lib
        for (int i = 0; i < bookCnt; i++) {
            if (this.books[i].title.equals(bookName)) {
                this.books[i].returned();
                System.out.println("You successfully returned" + bookName);
            }
        }

    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}