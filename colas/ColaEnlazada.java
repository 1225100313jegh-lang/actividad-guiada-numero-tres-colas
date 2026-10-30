package colas;
//integramos los nuevos metodos a nodo al estar enlazado
public class ColaEnlazada<T> {
    private Nodo<T> frente;
    private Nodo<T> fin;
    private int tamanio;
	public boolean estaVacia() {
    		return frente == null;
	}

	public int tamanio() {
	    return tamanio;
	}
/*ahora manejamos el encolar como la insercion en una lista simple
primero verificando si esta vacia y si esta insertar el valor, si
no esta vacia se mueve a la siguiente posición*/
	public void encolar(T valor) {
	    Nodo<T> nuevo = new Nodo<>(valor);
	    if (estaVacia()) {
	        frente = nuevo;
	    } else {
	        fin.siguiente = nuevo;
	    }
	    fin = nuevo;
	    tamanio++;
	    }
	public T desencolar() {
	    if (estaVacia()) {
	        throw new IllegalStateException("La cola está vacía");
	    }
	    T valor = frente.dato;
	    frente = frente.siguiente;
	    if (frente == null) {
	        fin = null; // la cola quedó vacía
	    }
	    tamanio--;
	    return valor;
	}
	public T frente() {
	    if (estaVacia()) {
	        throw new IllegalStateException("La cola está vacía");
	    }
	    return frente.dato;
}
	public void vaciar() {
	    frente = null;
	    fin = null;
	    tamanio = 0;
	}
    }