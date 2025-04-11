public class Book implements Searchable {
    private String title, author, genre;
    private int publicationYear;

    public Book(String title, String author, String genre, int publicationYear) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }

    @Override
    public boolean contains(String keyword) {
        return title.contains(keyword) || genre.contains(keyword);
    }

    @Override
    public String toString() {
        return String.format("%s by %s (%s, %d)", title, author, genre, publicationYear);
    }
} 