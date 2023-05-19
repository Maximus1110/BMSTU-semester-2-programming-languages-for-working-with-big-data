class Librarian {
    public void issueBookToReader(Book book, Reader reader, boolean isReadingRoom) {
        if (!reader.isBlacklisted()) {
            if (book.isAvailable()) {
                if (isReadingRoom) {
                    System.out.println("Issuing book: " + book.getTitle() + " to " + reader.getName() + " for reading in the reading room.");
                } else {
                    book.borrowBook(reader);
                }
            } else {
                System.out.println("Sorry, " + book.getTitle() + " is not available for borrowing.");
            }
        } else {
            System.out.println(reader.getName() + " is blacklisted and cannot borrow books.");
        }
    }

    public void processReturnedBook(Book book) {
        book.returnBook();
    }

    public void addToBlacklist(Reader reader) {
        reader.addToBlacklist();
    }

    public void removeFromBlacklist(Reader reader) {
        reader.removeFromBlacklist();
    }
}