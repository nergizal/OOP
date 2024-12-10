package weekeleven4;
// <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3
class Book{
    Author author;
    String name;
    double price;
    int qty=0;
    public Book(Author author, String name, double price){
        this.author=author;
        this.name=name;
        this.price=price;
    }
    public Book(String name, Author author, double price, int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }

    public String getName(){
        return this.name;
    }

    public Author getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.getPrice();
    }
    public void setPrice(double newPrice){
        this.price=newPrice;
    }
    public int getQty(){
        return this.qty;
    }
    public void setQty(int newQty){
        this.qty=newQty;
    }

    public String toString(){
        return 
    }


    class Author{
        
        String name;
        String email;
        String gender;
        public Author(String name, String email, String gender){
            this.name=name;
            this.email=email;
            this.gender=gender;
        }
    }
    

}

public class Main {
    public static void main(String[] args) { 
        Author author1 =new Author("Nergiz", "nergizalici65@gmaili.com", "female");
        Book book = new Book("Nergizim<3", null, 249.99, 123);
        
    }
}
