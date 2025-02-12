public class Book {
    public String title;
    public int releaseYear;
    public int pages;
    public Author author;

    public Book(String title, int pages, Author author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return title.contains(word) || author.name.contains(word) || author.surname.contains(word);
    }

    public int estimatePrice() {
        int price = (int) Math.floor(3 * pages * Math.sqrt(author.rating));
        return Math.max(price, 250);
    }

    public String toString() {
        return "Book{title='" + title + "', pages=" + pages + ", releaseYear=" + releaseYear + ", author=" + author + "}";
    }
}