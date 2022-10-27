public class Magazine extends Book{

    public Magazine(String name, String author, int stock, double price) {
        super(name, author, stock, price);
    }

    public Magazine(String name, int year, int stock, double price) {
        super(name, year, stock, price);
    }

    public Magazine() {
    }
    
    
}
