import java.util.ArrayList;
import java.util.List;

class Reader {
    private int readerId;
    private String name;
    private List<Book> orderList;
    private boolean isBlacklisted;

    public Reader(int readerId, String name) {
        this.readerId = readerId;
        this.name = name;
        this.orderList = new ArrayList<>();
        this.isBlacklisted = false;
    }

    public void placeOrder(Book book) {
        orderList.add(book);
        System.out.println(name + " has placed an order for the book: " + book.getTitle());
    }

    public void returnBook(Book book) {
        orderList.remove(book);
        System.out.println(name + " has returned the book: " + book.getTitle());
    }

    public void addToBlacklist() {
        isBlacklisted = true;
        System.out.println(name + " has been added to the blacklist.");
    }

    public void removeFromBlacklist() {
        isBlacklisted = false;
        System.out.println(name + " has been removed from the blacklist.");
    }

    public int getReaderId() {
        return readerId;
    }

    public String getName() {
        return name;
    }

    public boolean isBlacklisted() {
        return isBlacklisted;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", name='" + name + '\'' +
                ", orderList=" + orderList +
                ", isBlacklisted=" + isBlacklisted +
                '}';
    }
}
