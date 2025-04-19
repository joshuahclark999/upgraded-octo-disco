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

}
class MtLoBook implements ILoBook {
    MtLoBook() {
    }
}

class ConsoLoBook implements ILoBook {
    Book first;
    ILoBook rest;

    ConsoLoBook(Book first, ILoBook rest){
        this.first = first;
        this.rest = rest;
    }
}

class ILoBookExample {
    Book hp1  = new Book("HP1", "JKR", 1990, 20);
    Book hp2  = new Book("HP1", "JKR", 1990, 30);
    Book hp3  = new Book("HP3", "JKR", 1990, 40);
    ILoBook hplist3 = new ConsoLoBook(hp1, new ConsoLoBook(hp2, new ConsoLoBook(hp3, new MtLoBook())));

}


////Books
//Book htdp = new Book("HtDP", "MF", 2001, 60);
//Book lpp = new Book("LPP", "STX", 1942, 25);
//Book ll = new Book("LL", "FF", 1986, 10);
//
//// lists of Books
//ILoBook mtlist = new MtLoBook();
//ILoBook lista = new ConsLoBook(this.lpp, this.mtlist);
//ILoBook listb = new ConsLoBook(this.htdp, this.mtlist);
//ILoBook listc = new ConsLoBook(this.lpp,
//        new ConsLoBook(this.ll, this.listb));
//ILoBook listd = new ConsLoBook(this.ll,
//        new ConsLoBook(this.lpp,
//                new ConsLoBook(this.htdp, this.mtlist)));

public class Main {
    public static void main(String[] args) {
        }
    }