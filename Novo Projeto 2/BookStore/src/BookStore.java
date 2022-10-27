import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
    
    private ArrayList<Fiction> fictionBooks;
    private ArrayList<NonFiction> nonFictionBooks;
    private ArrayList<Magazine> magazineBooks;

    public BookStore(){

    }

    public void buyFictionBook(ArrayList<Fiction> list, String bookName, User user){
        for (Fiction book : list) {
            if(book.getName().equals(bookName)){
                if(user.getMoney() <= book.getPrice()){
                    System.out.println("Sorry you don't have this amount!");
                }else{
                    book.setStock(book.getStock() - 1);
                    user.setMoney(user.getMoney() - book.getPrice());

                    System.out.println("Buying process successfull!");
                    System.out.println("Thanks for using our store!");
                }
            }
            // list.remove(book)
        }
    }

    public void buyNonFictionBook(ArrayList<NonFiction> list, String bookName, User user){
        for (NonFiction book : list) {
            if(book.getName().equals(bookName)){
                if(user.getMoney() <= book.getPrice()){
                    System.out.println("Sorry you don't have this amount!");
                }else{
                    book.setStock(book.getStock() - 1);
                    user.setMoney(user.getMoney() - book.getPrice());
                }
            }
        }
    }

    public void buyMagazineBook(ArrayList<Magazine> list, String bookName, User user){
        for (Magazine book : list) {
            if(book.getName().equals(bookName)){
                if(user.getMoney() <= book.getPrice()){
                    System.out.println("Sorry you don't have this amount!");
                }else{
                    book.setStock(book.getStock() - 1);
                    user.setMoney(user.getMoney() - book.getPrice());
                }
            }
        }
    }

         
    public void showMenu(User user){

        Fiction hp = new Fiction("Harry Potter", "JK Rowling", 15, 10.99);
        Fiction sw = new Fiction("Star Wars", "George Lucas", 11, 7.99);
        NonFiction ad = new NonFiction("American Dirty", "Jeannie Cummins", 5, 9.45);
        NonFiction wa = new NonFiction("War's art", "Sun Tzu", 3, 10.0);
        Magazine fo = new Magazine("Forbes", 2018, 5, 2.99);

        fictionBooks = new ArrayList<>();
        nonFictionBooks = new ArrayList<>();
        magazineBooks = new ArrayList<>();

        fictionBooks.add(hp);
        fictionBooks.add(sw);
        nonFictionBooks.add(ad);
        nonFictionBooks.add(wa);
        magazineBooks.add(fo);
        

        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Welcome to the Book Store");
        do {

            System.out.println("*********************************");
            System.out.println("1. Fiction");
            System.out.println("2. Non-Fiction");
            System.out.println("3. Magazine");
            System.out.println("4. Exit");
            System.out.println("*********************************");

            System.out.print("Enter an option: ");
            option = scanner.next().charAt(0);
            System.out.println();
            
            switch (option) {
                case '1':
                    Scanner fictionScanner = new Scanner(System.in);
                    System.out.println("-----------------------------");
                    showTheFictionList(fictionBooks);
                    System.out.println("-----------------------------");
                    System.out.print("Please type the name of the book: ");

                    String nameOfBook = fictionScanner.nextLine();
                    buyFictionBook(fictionBooks, nameOfBook, user);

                    System.out.println("Total amount of money: " + user.getMoney());
                    break;
                case '2':
                Scanner nonFictionScanner = new Scanner(System.in);
                System.out.println("-----------------------------");
                showTheNonFictionList(nonFictionBooks);
                System.out.println("-----------------------------");
                System.out.print("Please type the name of the book: ");

                String nameOfNonFictionBook = nonFictionScanner.nextLine();
                buyNonFictionBook(nonFictionBooks, nameOfNonFictionBook, user);

                System.out.println("Total amount of money: " + user.getMoney());
                    break;
                case '3':
                Scanner magazineScanner = new Scanner(System.in);
                System.out.println("-----------------------------");
                showTheMagazineList(magazineBooks);
                System.out.println("-----------------------------");
                System.out.print("Please type the name of the book: ");

                String nameMagazineBook = magazineScanner.nextLine();
                buyMagazineBook(magazineBooks, nameMagazineBook, user);
                System.out.println("Total amount of money: " + user.getMoney());
                    break;
                case '4':
                    System.out.println("-----------------------------");
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid option! Please enter again.");
                    break;
            }
        }while(option != '4');
        System.out.println();
        System.out.println("Thank you for using our services!");
    }

    public void showTheFictionList(ArrayList<Fiction> list){
        for (Fiction fiction : list) {
             System.out.println(fiction.getName() + " ");
             if(fiction.getAuthor() == null){
                 System.out.println("No author");
             } else {
                 System.out.println(fiction.getAuthor() + " ");
             }
             System.out.println("Price: " + fiction.getPrice() + " ");
             System.out.println("Stock: " + fiction.getStock() + " ");
             if(fiction.getYear() == 0){
                 System.out.println("");
             } else{
                 System.out.println(fiction.getYear());
             }
            //logic to the differences between the products
        }
    }
     
    public void showTheNonFictionList(ArrayList<NonFiction> list){
        for (NonFiction nonFiction : list) {
             System.out.println(nonFiction.getName() + " ");
             if(nonFiction.getAuthor() == null){
                 System.out.println("No author");
             } else {
                 System.out.println(nonFiction.getAuthor() + " ");
             }
             System.out.println("Price: " + nonFiction.getPrice() + " ");
             System.out.println("Stock: " + nonFiction.getStock() + " ");
             if(nonFiction.getYear() == 0){
                 System.out.println("");
             } else{
                 System.out.println(nonFiction.getYear());
             }
            //logic to the differences between the products
        }
    }

    public void showTheMagazineList(ArrayList<Magazine> list){
        for (Magazine magazine : list) {
             System.out.println(magazine.getName() + " ");
             if(magazine.getAuthor() == null){
                 System.out.println("No author");
             } else {
                 System.out.println(magazine.getAuthor() + " ");
             }
             System.out.println("Price: " + magazine.getPrice() + " ");
             System.out.println("Stock: " + magazine.getStock() + " ");
             if(magazine.getYear() == 0){
                 System.out.println("");
             } else{
                 System.out.println("Year: " + magazine.getYear());
             }
            //logic to the differences between the products
        }
    }
     
}
