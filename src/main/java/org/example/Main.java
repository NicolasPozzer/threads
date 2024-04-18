package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Creamos los 2 objetos de la clase HiloNumerosLetras
        HiloNumeroLetras hilo1 = new HiloNumeroLetras(1);
        HiloNumeroLetras hilo2 = new HiloNumeroLetras(2);

        //Creamos los objetos de la Clase Thread y le asignamos los objetos nuestros.
        Thread t1 = new Thread(hilo1);
        Thread t2 = new Thread(hilo2);

        //Corremos los hilos
        t1.start();
        t2.start();

        //Existen diferentes acciones para
        // los hilos como: start, stop, suspend, resume...

    }
}