public class Book {

    private String name;
    private String author;
    private int stock;
    private double price;
    private int year;
    //generation of the variables

     //getters and setters

    public Book(String name, String author, int stock, double price) {
        this.name = name;
        this.author = author;
        this.stock = stock;
        this.price = price;
      }
  
      //constructor for the books: Fiction and Non Fiction
  
    public Book(String name, int year, int stock, double price) {
          this.name = name;
          this.year = year;
          this.stock = stock;
          this.price = price;
      }
  
      //constructor exclusive for Magazine

    public Book(){}

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }
   
    
}
       