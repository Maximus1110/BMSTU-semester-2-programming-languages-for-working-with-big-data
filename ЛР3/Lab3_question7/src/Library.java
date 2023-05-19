import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> catalog;
    private List<Reader> blacklist;

    public Library() {
        catalog = new ArrayList<>();
        blacklist = new ArrayList<>();
    }

    public void searchBookByTitle(String title) {
        System.out.println("Searching for book with title: " + title);
        for (Book book : catalog) {
            if (book.getTitle().equals(title)) {
                System.out.println("Book found: " + book);
                return;
            }
        }
        System.out.println("Book with title " + title + " not found in the catalog.");
    }

    public void searchBookByAuthor(String author) {
        System.out.println("Searching for book by author: " + author);
        for (Book book : catalog) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Book found: " + book);
            }
        }
    }

    public void addBookToCatalog(Book book) {
        catalog.add(book);
        System.out.println("Book added to the catalog: " + book.getTitle());
    }

    public void addReaderToBlacklist(Reader reader) {
        blacklist.add(reader);
        System.out.println(reader.getName() + " has been added to the blacklist.");
    }

    public void removeReaderFromBlacklist(Reader reader) {
        blacklist.remove(reader);
        System.out.println(reader.getName() + " has been removed from the blacklist.");
    }
}

