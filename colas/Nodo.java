package colas;
public class Nodo<T> {
//generamos el nodo que se movera en la cola con solo una direccion
    T dato;
    Nodo<T> siguiente;

    Nodo(T dato) {
        this.dato = dato;
    }

}
