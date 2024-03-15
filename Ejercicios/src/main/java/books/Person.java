
package books;

public class Person {
    int id;
    int books[] = {0,0,0};

    public Person(int id) {
        this.id = id;
    }
    
    public Person(){
        
    }
    
    public int getId() {
        return id;
    }

    public void setName(int id) {
        this.id = id;
    }
    
    public boolean pedirLibro(int code){
        boolean x = false;
        for(int i=0; i<3;i++){
            if(0==books[i]){
                x = true;
                this.books[i]=code;
            }
        }
        return x;
    }
    public boolean entregarLibro(int code){
        boolean x = false;
        for(int i=0; i<3;i++){
            if(books[i]==code){
                x = true;
                this.books[i]=0;
            }
        }
        return x;
    }
    public void antecedentes(){
        for(int i = 0; i<books.length;i++){
            if(books[i]!=0){
                System.out.println("La persona tiene el libro "+books[i]);
            }
        }
    }
}
