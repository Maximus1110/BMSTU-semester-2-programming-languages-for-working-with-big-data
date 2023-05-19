class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void checkAvailability() {
        System.out.println("Checking availability of the book: " + title);
        if (isAvailable) {
            System.out.println(title + " is available.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void borrowBook(Reader reader) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(reader.getName() + " has borrowed the book: " + title);
        } else {
            System.out.println("Sorry, " + title + " is not available for borrowing.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("The book: " + title + " has been returned.");
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}