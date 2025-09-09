import java.util.*;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;

class Book {
    private String title;
    private String genre;
    private int pages;
    
    public Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }
    
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getPages() { return pages; }
}

public class LibraryStatistics {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Book1", "Fiction", 300),
            new Book("Book2", "Non-Fiction", 250),
            new Book("Book3", "Fiction", 400),
            new Book("Book4", "Science", 350),
            new Book("Book5", "Non-Fiction", 200),
            new Book("Book6", "Fiction", 320),
            new Book("Book7", "Science", 280)
        );
        
        Map<String, IntSummaryStatistics> statsByGenre = books.stream()
            .collect(Collectors.groupingBy(
                Book::getGenre,
                Collectors.summarizingInt(Book::getPages)
            ));
        
        System.out.println("Book statistics by genre:");
        statsByGenre.forEach((genre, stats) -> 
            System.out.printf("%s: Total=%d, Avg=%.1f, Max=%d, Count=%d%n",
                genre, stats.getSum(), stats.getAverage(), 
                stats.getMax(), stats.getCount()));
    }
}