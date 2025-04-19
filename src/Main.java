import tester.*;


class Book {
    String title;
    String author;
    int year;
    double price;
    Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }
}
interface ILoBook {
    int count();
    double totalPrice();
    double salePrice(int discount);
    ILoBook allBefore(int y);
    ILoBook sortByPrice();
}
class ConsoLoBook implements ILoBook {

}

public class Main {
    public static void main(String[] args) {
        }
    }