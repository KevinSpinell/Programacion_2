
package com.mycompany.restaurant;
import com.mycompany.restaurant.people.People;
import com.mycompany.restaurant.food.Dish;
import com.mycompany.restaurant.food.Menu;
import com.mycompany.restaurant.people.Clients;
import com.mycompany.restaurant.values.CustomerRole;
import com.mycompany.restaurant.values.DishType;
import java.util.Scanner;
public class Restaurant {

    public static void main(String[] args) {
        
        
        Clients clientes = new Clients();
         
        Scanner cap=new Scanner(System.in);
        People student1 = new People(CustomerRole.STUDENT,"asd","Jose Torres");
        People student2 = new People(CustomerRole.STUDENT,"afd","Mauricio Jehova");
        People student3 = new People(CustomerRole.STUDENT,"agd","Kevin Nalli");
        People student4 = new People(CustomerRole.STUDENT,"ahd","XDDDDDDDDD");
        People administrative = new People(CustomerRole.ADMINISTRATIVE,"eed","Cocinera fastidiosa");
        People profesora = new People(CustomerRole.TEACHER,"eed","Cocinera fastidiosa");
        People director = new People(CustomerRole.TEACHER,"eed","Cocinera fastidiosa");
        
        
        clientes.addPeople(student1);
        clientes.addPeople(student2);
        clientes.addPeople(student3);
        clientes.addPeople(student4);
        clientes.addPeople(administrative);
        clientes.addPeople(profesora);
        clientes.addPeople(director);
        
        
        
        Menu menu = new Menu();

        Dish bf1=new Dish(DishType.BREAKFAST,"Sandwich","Sandwich de pollo con jugo de guanabana",35,7000);
        Dish bf2=new Dish(DishType.BREAKFAST,"Pan con huevo revuelto","Pan, huevos revueltos y café",15,7000);
        Dish bf3=new Dish(DishType.BREAKFAST,"Cereal","Cereal zucaritas bien rico con leche y juguito de guanaba si o qué",20,7000);
        Dish lun1=new Dish(DishType.LUNCH,"Pastas a la bolognesa","Pastas frescas",88,7000);
        Dish lun2=new Dish(DishType.LUNCH,"Bandeja paisa","Arroz, frijoles, tajada, huevo frito, chorizo y carne de res",95,7000);
        Dish lun3=new Dish(DishType.LUNCH,"Pollo frito","Arroz, frijoles, tajada y pollo frito",63,7000);
        Dish din1=new Dish(DishType.DINNER,"Sandwich","Sandwich de pollo con jugo de guanabana",33,7000);
        Dish din2=new Dish(DishType.DINNER,"Arepa con huevo","Arepa con huevos revueltos",23,7000);
        Dish din3=new Dish(DishType.DINNER,"Tamal","Tamal de carne de cerdo",15,7000);
        
        menu.addDish(bf1);
        menu.addDish(bf2);
        menu.addDish(bf3);
        menu.addDish(lun1);
        menu.addDish(lun2);
        menu.addDish(lun3);
        menu.addDish(din1);
        menu.addDish(din2);
        menu.addDish(din3);
        
        System.out.println("¿Qué tipo de comida desea comprar?");
        System.out.println("1.  Desayuno");
        System.out.println("2.  Almuerzo");
        System.out.println("3.  Cena");
        int a=cap.nextInt();
        
        switch(a){
            case 1 -> 
                System.out.println(menu.getDishesPerType(DishType.BREAKFAST, (Clients) clientes, (String) "sdvs sfd");
            case 2 -> 
                System.out.println(menu.getDishesPerType(DishType.LUNCH));
            case 3 -> 
                System.out.println(menu.getDishesPerType(DishType.DINNER));
            default -> 
                System.out.println("Error");
        }
    }
}
