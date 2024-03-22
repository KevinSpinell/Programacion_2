
package com.mycompany.restaurant.people;
import com.mycompany.restaurant.values.CustomerRole;
import java.util.ArrayList;

public class Clients {
    private ArrayList<People> peoplelist;
    
    public Clients() {
        this.peoplelist = new ArrayList<>();
    }
    
    public void addPeople(People people){
        this.peoplelist.add(people);
    }
    
    public double getPricePerRole(String id){
        for(People people: peoplelist){
            if(id==people.getId()){
                if(people.getRole()==CustomerRole.STUDENT){
                    return 0.3428;
                }else{
                    return 1;
                }
            }
        }
        return 1;
    }
}
