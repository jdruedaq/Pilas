/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilaLista;

/**
 * @author sigacdev
 */
public class PilaLista {

    private NodoPila cima;
    private int maxLength;

    PilaLista(int maxLength) {
        this.maxLength = maxLength;
        cima = null;
    }

    private boolean pilaVacia() {
        return cima == null;
    }

    void insertar(Object elemento) {
        NodoPila nuevo;
        nuevo = new NodoPila(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    Object quitar() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }

        Object aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }

    Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede leer cima.");
        }
        return cima.elemento;
    }

    public void limpiarPila() {
        NodoPila t;
        while (!pilaVacia()) {
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }

    int print() {
        NodoPila t = cima;

        int i = length();
        while (!pilaVacia() && t != null) {
            Vehicle vehicle = (Vehicle) t.elemento;
            System.out.printf("Vehiculo placas %6s ubicado en posición %2d\n", vehicle.enrollment, i);
            t = t.siguiente;
            i--;
        }
        System.out.println();
        System.out.println();
        return i;
    }

    int print(String ref) {
        NodoPila t = cima;

        int i = length();
        while (!pilaVacia() && t != null) {
            Vehicle vehicle = (Vehicle) t.elemento;
            if (!ref.equals(vehicle.enrollment)) {
                System.out.printf("Vehiculo placas %6s ubicado en posición %2d\n", vehicle.enrollment, i);
                t = t.siguiente;
                i--;
            } else {
                break;
            }
        }
        System.out.println();
        System.out.println();
        return i;
    }

    int length() {
        NodoPila t = cima;

        int i = 0;
        while (!pilaVacia() && t != null) {
            t = t.siguiente;
            i++;
            System.out.println();
            System.out.println();
        }
        return i;
    }

    int getMaxLength() {
        return maxLength;
    }
}
