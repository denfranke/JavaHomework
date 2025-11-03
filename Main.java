package Homework_6;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Denis sam sdelal etot kod", 12, new Author("Max","Ming", 5), 50);
        System.out.println(book.isBig() ? ">=500" : "<500");
        System.out.println(book.matches("sam") ? "Слово найдено" : "Словов не найдено");
        System.out.println("Цена: " + book.estimatePrice());
    }
}
