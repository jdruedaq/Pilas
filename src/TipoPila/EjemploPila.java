/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoPila;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author sigacdev
 */
public class EjemploPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaLineal pila;
        int x;
        final int CLAVE = -1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Teclea los elemento (termina con -1).");
        try {
            pila = new PilaLineal(); // crea pila vacía
            do {
                x = Integer.parseInt(entrada.readLine());
                pila.insertar(x);
            } while (x != CLAVE);
            System.out.println("Elementos de la Pila: ");
            while (!pila.pilaVacia()) {
                x = (int) pila.quitar();
                System.out.print(x + " ");
            }
        } catch (Exception er) {
            System.err.println("Excepcion: " + er);
        }
    }

}
