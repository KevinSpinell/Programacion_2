
package com.mycompany.restaurant.people;

import com.mycompany.restaurant.values.CustomerRole;

public class People {
    private CustomerRole role;
    String id;
    String fullname;

    public People(CustomerRole role, String id, String fullname) {
        this.role = role;
        this.id = id;
        this.fullname = fullname;
    }
    public People(){
        
    }
    
    
    private void sayMenu(){
        
    }
    public void buyFood(){
        
    }
    public void cancelMenu(){
        
    }
    public void sellFood(){
        if(this.role != CustomerRole.ADMINISTRATIVE){
            System.out.println("Solo administrativos pueden vender comida");
            return;
        }
        System.out.println("Ya lo atiendo");
    }
    
}
