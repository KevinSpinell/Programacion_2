package com.mycompany.listas;

import java.util.*;

public class Listas {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hola");
        list.add("Mundo");
        list.add("Cruel");
        list.set(1,"XD");
        list.remove(2);
        System.out.println( list.get(0));
        System.out.println("Tamaño de la lista: " +list.size());
        System.out.println("Esta vacia? "+ list.isEmpty());
        System.out.println("Valores de la lista:  "+ list);
    }
}
