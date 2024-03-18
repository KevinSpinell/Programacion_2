
package com.mycompany.restaurant.food;

import com.mycompany.restaurant.values.DishType;

public class Dish {
    private DishType type;
    private String name;
    private String ingredients;
    private int qty;
    private int price; // Varia segun usuario 34.29

    public Dish(DishType type, String name, String ingredients, int qty, int price) {
        this.type = type;
        this.name = name;
        this.ingredients = ingredients;
        this.qty = qty;
        this.price = price;
    }

    public DishType getType() {
        return this.type;
    }

    

    
    
    
    
}
