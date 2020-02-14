package day3;

public class Book {
    private String title;
    private String author;
    private String language;
    private int numPages;
    private int numWords;

    public Book(String title, String author, String language) {
        this.title = title;
        this.author = author;
        this.language = language;
        this.numPages = 0;
        this.numWords = 0;
    }
    public void setTitle (String title) {
        this.title = title;
    }
    public void setAuthor (String author) {
        this.author = author;
    }
    public void setLanguage (String language) {
        this.language = language;
    }
    public void setnumberOfWords (int numWords) {
        this.numWords = numWords;
    }
    public void setnumberOfPages (int numPages) {
        this.numPages = numPages;
    }
    public String getTitle() {
        return this.title;
    }
    public double getaverageWordsPerPage() {
        return (this.numWords/this.numPages);
    }
    public String toString() {
        return title + " by " + author + " (" + language + ")";
    }
}