public class main1 {
    public static void main(String[] args) {
        Author author = new Author("Olga", "Petrova", 4);
        Book book = new Book("World", 501, author);

        System.out.println(book);

        book.pages = 600;
        book.author = new Author("Petya", "Ivanov", 5);
        book.title = "World";
        book.releaseYear = 2000;

        System.out.println("Книга большая? " + book.isBig());
        System.out.println("Соответствует 'Petrova'? " + book.matches("Petrova"));
        System.out.println("Цена книги: " + book.estimatePrice() + " руб.");
    }
}