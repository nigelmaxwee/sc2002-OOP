import java.util.*;
import java.util.stream.*;

public class Library<T extends Searchable> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getItems() {
        return items;
    }

    public List<T> filterByGenre(String genre) {
        return items.stream()
                .filter(i -> i instanceof Book && ((Book) i).getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    public List<T> filterByAuthor(String author) {
        return items.stream()
                .filter(i -> i instanceof Book && ((Book) i).getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public List<T> searchByKeyword(String keyword) {
        return items.stream()
                .filter(i -> i.contains(keyword))
                .collect(Collectors.toList());
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public void sortByTitle() {
        items.sort(Comparator.comparing(i -> ((Book) i).getTitle()));
    }
} 