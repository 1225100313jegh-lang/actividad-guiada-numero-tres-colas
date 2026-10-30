package colas;
public class ColaArreglo {
    private int[] datos;//creamos el arreglo llamado datos
    private int frente;//gurdara el valor para su consulta
    private int fin;//ultimo valor de la cola
    private int tamanio;//longitud de la cola
    private int capacidad;//cuantos valores aceptara la cola
//Inicializamos el arreglo con su tamanio en 0 y fin en la posicion inicial
    public ColaArreglo(int capacidad) {
        this.capacidad = capacidad;
        this.datos = new int[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamanio = 0;
    }
	//Si el resultado lanza true significa que la cola esta vacia
	public boolean estaVacia() {
	    return tamanio == 0;
	}
	//Si el tamanio de la cola es igual a la capcidad significa que esta llena
	public boolean estaLlena() {
    	    return tamanio == capacidad;
	}

	public int tamanio() {
    	    return tamanio;
	}
	//agregamos el metodo encolar que primero valida si no esta llena si si, lanza un error si no agregamos el valor
	public void encolar(int valor) {
    		if (estaLlena()) {
        	throw new IllegalStateException("La cola está llena");
    	}
    	fin = (fin + 1) % capacidad; // avance circular
    	datos[fin] = valor;
    	tamanio++;
	}
	public int desencolar() {
    	if (estaVacia()) {
        	throw new IllegalStateException("La cola está vacía");
    	}
    	int valor = datos[frente];
    	frente = (frente + 1) % capacidad;
    	tamanio--;
    	return valor;
	}

	public int frente() {
    		if (estaVacia()) {
        		throw new IllegalStateException("La cola está vacía");
    		}
    	return datos[frente];
	}
	public void vaciar() {
	    frente = 0;
	    fin = -1;
	    tamanio = 0;
}

}