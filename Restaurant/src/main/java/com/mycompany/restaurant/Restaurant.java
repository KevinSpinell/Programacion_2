
package com.mycompany.restaurant;
import people.People;
import food.Dish;
import values.CustomerRole;
public class Restaurant {

    public static void main(String[] args) {
        People student = new People(CustomerRole.STUDENT, "asd", "Kevin Nalli" );
        student.sellFood();
        People administrative = new People(CustomerRole.ADMINISTRATIVE, "asd", "BDW" );
        administrative.sellFood();
    }
}
