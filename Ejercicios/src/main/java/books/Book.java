
package books;

public class Book {
    String title;
    int id;
    int quantity;
    String genre;

    public Book(String title, int id, int quantity, String genre) {
        this.title = title;
        this.id = id;
        this.quantity = quantity;
        this.genre = genre;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String tittle) {
        this.title = tittle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    public boolean disponibility(){
        return 0!=quantity;
    }
    
    
}