
package com.mycompany.restaurant;
import com.mycompany.restaurant.people.People;
import com.mycompany.restaurant.food.Dish;
import com.mycompany.restaurant.food.Menu;
import com.mycompany.restaurant.values.CustomerRole;
import com.mycompany.restaurant.values.DishType;

public class Restaurant {

    public static void main(String[] args) {
        People student = new People(CustomerRole.STUDENT, "asd", "Kevin Nalli" );
        student.sellFood();
        People administrative = new People(CustomerRole.ADMINISTRATIVE, "asd", "BDW" );
        administrative.sellFood();
        
        Menu menu = new Menu();
        
        Dish bf1 = new Dish(DishType.BREAKFAST, "Huevos Revueltos", "Huevo y Pan", 35, 7000);
        Dish bf2 = new Dish(DishType.BREAKFAST, "Caldo de Pollo", "Arepa y Caldo", 15, 7000);
        Dish lunch1 = new Dish(DishType.LUNCH, "Bandeja paisa", "Frijoles, Tajada, Huevo Frito, Arroz, Ensalada, Chorizo.", 45, 7000);
        Dish lunch2 = new Dish(DishType.LUNCH, "Carne Asada", "Solomillo de Res asado, yuca, ensalada, arroz", 88, 7000);
        menu.addDish(bf1);
        menu.addDish(bf2);
        menu.addDish(lunch1);
        menu.addDish(lunch2);
        
        System.out.println(menu.getDishesType(DishType.BREAKFAST));
    }
}
