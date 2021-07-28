package book;
import java.util.*;

public class Book {
    private String name;
    private ArrayList<Author> author_list = new ArrayList<>();
    private double price;
    private int qtyInStock;

    public Author inputAuthor(){
        Scanner scn = new Scanner(System.in);
        Author author = new Author();

        System.out.print("nhap ten tac gia");
        author.setName(scn.nextLine());

        System.out.print("nhap email cua tac gia");
        author.setEmail(scn.nextLine());

        System.out.println("nhap gioi tinh (B: boy, G: girl)");
        author.setGender(scn.next().charAt(0));

        return author;
    }

    public void addAuthorToList(Author author){
        author_list.add(author);
    }

    public void printAuthor(){
        for(Author author : author_list){
            System.out.println(author);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author_list=" + author_list +
                ", price=" + price +
                ", qtyInStock=" + qtyInStock +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public Book(String name, double price, int qtyInStock) {
        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
