package section09.extends01.ex;

public class Book extends Item  {
    private String writer;
    private String isbn;

    Book(String name, int price, String writer, String isbn) {
        super(name, price);
        this.writer = writer;
        this.isbn = isbn;
    }

    public void print() {
        super.print();
        System.out.println("- 저자: " + writer + ", isbn: " + isbn);
    }
}
