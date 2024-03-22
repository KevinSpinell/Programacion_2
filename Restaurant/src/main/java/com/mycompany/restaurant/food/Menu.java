
package com.mycompany.restaurant.food;
import com.mycompany.restaurant.values.DishType;
import com.mycompany.restaurant.people.Clients;
import com.mycompany.restaurant.people.People;
import java.util.*;

public class Menu {
    
    private ArrayList<Dish> dishlist;

    
    public Menu() {
        this.dishlist = new ArrayList<>();
    }
    
    public Menu(ArrayList<Dish> dishlist) {
        this.dishlist = dishlist;
    }
    
    public void addDish(Dish dish){
        this.dishlist.add(dish);
    }
    public ArrayList<String> getDishesPerType(DishType dishType,Clients peoplelist, String id){
        ArrayList<String> foundDishes=new ArrayList<>();
        for(Dish dish:dishlist){
            if(dish.getType()==dishType){
                foundDishes.add(" |"+dish.getName() +" : "+ dish.getIngredients()+" "+dish.getPrice(peoplelist.getPricePerRole(id))+"\n");
            }
        }
        
        return foundDishes;
        
    }
}
