
package com.mycompany.ejercicios;
import books.Book;
import books.Person;
import java.util.*;
public class Ejercicios {
    public static void menu(Book[] inventary, Person[] peoples){
         System.out.println("----------------------");
        System.out.println("Inventario:");
        for (Book inventary1 : inventary) {
            System.out.println(inventary1.getId()+"   "+inventary1.getTitle()+"  "+inventary1.getGenre()+"  "+inventary1.getQuantity());
        }
         System.out.println("----------------------");
        bookAction(inventary,peoples);
    }
    public static void bookAction(Book[] inventary, Person[] peoples){
        Scanner cap = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Que desea hacer?");
        System.out.println("1. Consultar disponibilidad");
        System.out.println("2. Pedir libro");
        System.out.println("3. Entregar libro");
        System.out.println("3. Consultar Antecedentes");
        System.out.println("----------------------");
        int a = cap.nextInt();
        switch(a){
            case 1 -> {
                System.out.println("Ingrese codigo de libro");
                a = cap.nextInt();
                for (Book inventary1 : inventary) {
                    if(inventary1.getId()==a){
                        if(inventary1.disponibility()){
                            System.out.println("Disponible - Cantidad: " + inventary1.getQuantity());
                        }else{
                            System.out.println("No Disponible");
                        }
                    }
                }
                menu(inventary,peoples);
                break;
            }
            case 2 ->{
                System.out.println("Ingrese codigo de libro");
                a = cap.nextInt();
                for (Book inventary1 : inventary) {
                    if(inventary1.getId()==a){
                        int x = inventary1.getQuantity();
                        System.out.println("Ingrese Nombre de Persona");
                        int name = cap.nextInt();
                        for( Person as:peoples){
                            if(name==as.getId()){
                                boolean s = as.pedirLibro(inventary1.getId());
                                if(s){
                                    inventary1.pedirLibro(as.getId(), inventary1.getQuantity());
                                    System.out.println("Pedido Existoso!");
                                    inventary1.pedirLibro(name, x);
                                    inventary1.setQuantity(x-1);
                                }else{
                                    System.out.println("Error");
                                }
                            }
                        }
                    }
                }
                menu(inventary,peoples);
                break;
            }
            case 3 ->{
                System.out.println("Ingrese codigo de libro");
                a = cap.nextInt();
                for (Book inventary1 : inventary) {
                    if(inventary1.getId()==a){
                        int x = inventary1.getQuantity();
                        System.out.println("Ingrese ID de Persona");
                        int name = cap.nextInt();
                        for( Person as:peoples){
                            if(name==as.getId()){
                                boolean s = as.entregarLibro(inventary1.getId());
                                if(s){
                                    inventary1.entregarLibro(as.getId(), inventary1.getQuantity());
                                    System.out.println("Pedido Existoso!");
                                    inventary1.pedirLibro(name, x);
                                    inventary1.setQuantity(x+1);
                                }else{
                                    System.out.println("Error");
                                }
                            }
                        }
                    }
                }
                menu(inventary,peoples);
                break;
            }
            case 4 ->{
                System.out.println("Ingrese ID de la persona");
                int name = cap.nextInt();
                for(Person as:peoples){
                    if(name== as.getId()){
                        as.antecedentes();
                        menu(inventary,peoples);
                    }
                }
            }
            default ->{
                System.out.println("Vaya y coma  mucha mierda pelao");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Book book1 = new Book("Boulevar", 001, 10, "Romance");
        Book book2 = new Book("Maze Runner", 002, 10, "Distopía");
        Book book3 = new Book("A traves de mi ventana", 003, 6, "Romance");
        Book book4 = new Book("Rey Arruinado", 004, 10, "Fantasia");
        Book book5 = new Book("Ready player one", 005, 10, "Ciencia Ficcion");
        Book[] inventary = {book1, book2, book3, book4, book5};
        Person persona1 = new Person(192201);
        Person persona2 = new Person(192202);
        Person persona3 = new Person(192021);
        Person persona4 = new Person(192198);
        Person peoples[] ={persona1,persona2,persona3,persona4};
        menu(inventary,peoples);
        
    }
}
