package com.mycompany.tallersolid.seccionb;

import Store.Book;

/**
 *
 * @author Grupo 9
 */

public class Main {

    public static void main(String[] args) {
        // ignorar, solo es una prueba
        Book b1 = new Book ("La Odisea", 20, 2);
        
        System.out.println("IVA: " + b1.calculateIva());
        System.out.println(b1.getIva());
    }
    
}
