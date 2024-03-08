
package books;

public class Person {
    String Name;
    int books[] = {0,0,0};
    int date[];

    public Person(String Name) {
        this.Name = Name;
    }
    
    public Person(){
        
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public boolean pedirLibro(int code, int quantity){
        boolean x = false;
        for(int i=0; i<3;i++){
            if(i==books[i]){
                x = true;
                this.books[i]=code;
            }
        }
        return x;
    }
    public void entregarLibro(int code, int quantity){
        boolean x = false;
        for(int i=0; i<3;i++){
            if(i!=books[i]){
                x = true;
                this.books[i]=0;
            }
        }
        return x;
    }
}
