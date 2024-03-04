
package com.mycompany.ejercicios;
import books.Book;
import java.util.*;
public class Ejercicios {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        Book book1 = new Book("Boulevar", 001, 10, "Romance");
        Book book2 = new Book("Maze Runner", 002, 10, "Distopía");
        Book book3 = new Book("A traves de mi ventana", 003, 6, "Romance");
        Book book4 = new Book("Rey Arruinado", 004, 10, "Fantasia");
        Book book5 = new Book("Ready player one", 005, 10, "Ciencia Ficcion");
        Book[] inventary = {book1, book2, book3, book4, book5};
        System.out.println("Inventario:");
        for (Book inventary1 : inventary) {
            System.out.println(inventary1.getId()+"   "+inventary1.getTitle()+"  "+inventary1.getGenre());
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Que desea hacer?");
        System.out.println("1. Consultar disponibilidad");
        System.out.println("2. Pedir libro");
        System.out.println("3. Entregar libro");
        int a = cap.nextInt();
        switch(a){
            case 1 -> {
                System.out.println("Ingrese codigo de libro");
                a = cap.nextInt();
            for (Book inventary1 : inventary) {
                if(inventary1.getId()==a){
                    if(inventary1.disponibility()){
                        System.out.println("Disponible");
                    }else{
                        System.out.println("No Disponible");
                    }
                }
            }
                
            }
        }
    }
}
