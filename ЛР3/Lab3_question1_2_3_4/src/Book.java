import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    private int id;
    private String title;
    private String[] authors;
    private String publisher;
    private int year;
    private int pageCount;
    private double price;
    private String binding;

    public Book(int id, String title, String[] authors, String publisher, int year, int pageCount, double price, String binding) {
        this.id = id;
        this.title = title;
        this.authors = (String[])authors.clone();
        this.publisher = publisher;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
        this.binding = binding;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return this.authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBinding() {
        return this.binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public static Book[] generateRandomBooks(int count) {
        Book[] books = new Book[count];
        String[] authors = new String[]{"Author 1", "Author 2", "Author 3"};
        String[] publishers = new String[]{"Publisher 1", "Publisher 2", "Publisher 3"};
        String[] bindings = new String[]{"Softcover", "Hardcover", "E-book"};

        for(int i = 0; i < count; ++i) {
            String title = "Book " + i;
            String author = authors[(int)(Math.random() * (double)authors.length)];
            String publisher = publishers[(int)(Math.random() * (double)publishers.length)];
            int year = 1900 + (int)(Math.random() * 123.0);
            int pages = 100 + (int)(Math.random() * 901.0);
            double price = 100.0 + (double)((int)(Math.random() * 300.0));
            String binding = bindings[(int)(Math.random() * (double)bindings.length)];
            books[i] = new Book(i, title, new String[]{author}, publisher, year, pages, price, binding);
        }

        return books;
    }

    public String toString() {
        int var10000 = this.id;
        return "Book{id=" + var10000 + ", title='" + this.title + "', authors=" + Arrays.toString(this.authors) + ", publisher='" + this.publisher + "', year=" + this.year + ", pageCount=" + this.pageCount + ", price=" + this.price + ", binding='" + this.binding + "'}";
    }

    public static Book[] searchByAuthor(Book[] books, String author) {
        System.out.println("Список книг автора " + author + ":");
        ArrayList<Book> result = new ArrayList();
        Book[] var3 = books;
        int var4 = books.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Book book = var3[var5];
            String[] var7 = book.getAuthors();
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
                String authorBook = var7[var9];
                if (authorBook.contains(author)) {
                    result.add(book);
                    break;
                }
            }
        }

        return (Book[])result.toArray(new Book[result.size()]);
    }

    public static Book[] searchByPublisher(Book[] books, String publisher) {
        ArrayList<Book> result = new ArrayList();
        System.out.println("Список книг издательства " + publisher + ":");
        Book[] var3 = books;
        int var4 = books.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Book book = var3[var5];
            if (book.getPublisher().equals(publisher)) {
                result.add(book);
            }
        }

        return (Book[])result.toArray(new Book[result.size()]);
    }

    public static Book[] searchByYear(Book[] books, int year) {
        ArrayList<Book> result = new ArrayList();
        System.out.println("Список книг, выпущенных после " + year + " года:");
        Book[] var3 = books;
        int var4 = books.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Book book = var3[var5];
            if (book.getYear() > year) {
                result.add(book);
            }
        }

        return (Book[])result.toArray(new Book[result.size()]);
    }

    public static void demonstration(int n) {
        System.out.println("ЛР 3.5 'Book'");
        Book[] books = generateRandomBooks(n);
        System.out.println("Сгенерированные значения");
        Book[] var2 = books;
        int var3 = books.length;

        int var4;
        Book b;
        for(var4 = 0; var4 < var3; ++var4) {
            b = var2[var4];
            System.out.println(b);
        }

        var2 = searchByAuthor(books, "Author 1");
        var3 = var2.length;

        for(var4 = 0; var4 < var3; ++var4) {
            b = var2[var4];
            System.out.println(b);
        }

        var2 = searchByPublisher(books, "Publisher 2");
        var3 = var2.length;

        for(var4 = 0; var4 < var3; ++var4) {
            b = var2[var4];
            System.out.println(b);
        }

        var2 = searchByYear(books, 2000);
        var3 = var2.length;

        for(var4 = 0; var4 < var3; ++var4) {
            b = var2[var4];
            System.out.println(b);
        }

    }
}
