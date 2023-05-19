public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1, "Великий Гэтсби", "Ф. Скотт Фицджеральд");
        Book book2 = new Book(2, "Убить пересмешника", "Харпер Ли");
        Book book3 = new Book(3, "Гордость и предубеждение", "Джейн Остин");

        library.addBookToCatalog(book1);
        library.addBookToCatalog(book2);
        library.addBookToCatalog(book3);

        Reader reader1 = new Reader(1, "Джон");
        Reader reader2 = new Reader(2, "Алиса");

        reader1.placeOrder(book2);
        reader2.placeOrder(book3);

        Librarian librarian = new Librarian();
        librarian.issueBookToReader(book2, reader1, false);
        librarian.issueBookToReader(book3, reader2, true);

        reader1.returnBook(book2);

        Administrator administrator = new Administrator();
        administrator.addToBlacklist(reader1);

        librarian.issueBookToReader(book2, reader1, false);
    }
}


//1.	Класс Reader (Читатель):
//    •	Свойства:
//    •	readerId (идентификатор читателя)
//    •	name (имя читателя)
//    •	orderList (список заказанных книг)
//    •	isBlacklisted (флаг, указывающий на нахождение в "черном списке")
//    •	Методы:
//    •	placeOrder(book: Book) - оформляет заказ на книгу
//    •	returnBook(book: Book) - возвращает книгу
//    •	addToBlacklist() - добавляет читателя в "черный список"
//    •	removeFromBlacklist() - удаляет читателя из "черного списка"
//2.	Класс Book (Книга):
//    •	Свойства:
//    •	bookId (идентификатор книги)
//    •	title (название книги)
//    •	author (автор книги)
//    •	isAvailable (флаг, указывающий на доступность книги в библиотеке)
//    •	Методы:
//    •	checkAvailability() - проверяет доступность книги
//    •	borrowBook(reader: Reader) - выдает книгу читателю
//    •	returnBook() - возвращает книгу в библиотеку
//3.	Класс Library (Библиотека):
//    •	Свойства:
//    •	catalog (каталог книг)
//    •	blacklist (список читателей в "черном списке")
//    •	Методы:
//    •	searchBookByTitle(title: String) - осуществляет поиск книги по названию в каталоге
//    •	searchBookByAuthor(author: String) - осуществляет поиск книги по автору в каталоге
//    •	addBookToCatalog(book: Book) - добавляет книгу в каталог
//    •	addReaderToBlacklist(reader: Reader) - добавляет читателя в "черный список"
//    •	removeReaderFromBlacklist(reader: Reader) - удаляет читателя из "черного списка"
//4.	Класс Librarian (Библиотекарь):
//    •	Методы:
//    •	issueBookToReader(book: Book, reader: Reader, isReadingRoom: boolean) - выдает книгу читателю на абонемент или в читальный зал
//    •	processReturnedBook(book: Book) - обрабатывает возвращенную книгу
//    •	addToBlacklist(reader: Reader) - добавляет читателя в "черный список"
//    •	removeFromBlacklist(reader: Reader) - удаляет читателя из "черного списка"
//5.	Класс Administrator (Администратор):
//    •	Методы:
//    •	addToBlacklist(reader: Reader) - добавляет читателя в "черный список"
//    •	removeFromBlacklist(reader: Reader) - удаляет читателя из "черного списка"

