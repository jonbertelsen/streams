package app;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {

    public void runStreamExercise(){
        System.out.println("Hej bibiotek!");

        // Opret en liste af bøger

        List<Book> books = List.of(
                new Book("1984", "George Orwell", 1948, 9.0, 224),
                new Book("Pissedårlig undervisning", "Andreas von Oettingen", 2020, 8.5, 86),
                new Book("Ringenes Herre I-III", "J.R.R. Tolkien", 1953, 9.5, 1300),
                new Book("Brave New World", "Aldous Huxley", 1932, 8.7, 311),
                new Book("Clean Code", "Robert C. Martin", 2008, 9.1, 464),
                new Book("The Pragmatic Programmer", "Andrew Hunt & David Thomas", 1999, 9.0, 352),
                new Book("Harry Potter og De Vises Sten", "J.K. Rowling", 1997, 8.8, 223),
                new Book("Sapiens", "Yuval Noah Harari", 2011, 8.9, 498),
                new Book("Effective Java", "Joshua Bloch", 2018, 9.3, 416),
                new Book("Kvinden der forsvandt", "Sara Blædel", 2010, 7.8, 378),
                new Book("Manden er forsvandt", "Sara Blædel", 2012, 8.2, 390)
        );

        books.forEach(b -> System.out.println(b));

        // Beregn gennemsnits-rating

        System.out.println("*** Gennemsnits-rating");

        double avgRating = books.stream()
                .collect(Collectors.averagingDouble(b -> b.getRating()));

        System.out.println("Gennemsnitsrating: " + avgRating);

        // Filtrér bøger efter år

        System.out.println("****** Filtrer efter år ******");

        List<Book> newerBooks = books.stream()
                .filter(b -> b.getPublicationYear() > 2009)
                .toList();

        newerBooks.forEach(b -> System.out.println(b));

        // Sortér bøger efter rating (faldende)

        System.out.println("***** Sorter efter rating ******");

        List<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparing(Book::getRating).reversed())
                .toList();

        sortedBooks.forEach(b -> System.out.println(b));

        // Find titlen på bogen med højest rating

        System.out.println("***** Højeste rating ******");

        Book maxRating = books.stream()
                .max(Comparator.comparingDouble(b -> b.getRating()))
                .get();

        System.out.println("Titel på højest rating:" + maxRating.getTitle());

        // Gruper bøger efter forfatter og beregn gennemsnit

        Map<String, Double> authorRatingMap = books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor,
                        Collectors.averagingDouble(Book::getRating)));

        authorRatingMap.forEach( (autor, rating) -> System.out.println(autor + ": " + rating));

        // Beregn samlet sidetal

        System.out.println("**** Samlet sideantal ******");

        int samletAntalSider = books.stream()
                .collect(Collectors.summingInt(b -> b.getPages()));

        System.out.println("Samlet antal sider: " + samletAntalSider);

    }

}
