package colas;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
/*
* Juan Eduardo Gonzalez Hernandez
* 30/10/26
*/
public class Main {
    public static void main(String[] args) {
        /* 
        System.out.println("Entorno listo");
        ColaArreglo cola = new ColaArreglo(3);
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        System.out.println("Sale: " + cola.desencolar()); // 10
        cola.encolar(40); // reutiliza la posición 0
        System.out.println("Frente: " + cola.frente()); // 20
        System.out.println("Tamaño: " + cola.tamanio()); // 3
        System.out.println("¿Llena? " + cola.estaLlena()); // true

        ColaEnlazada<String> nombres = new ColaEnlazada<>();
        nombres.encolar("Ana");
        nombres.encolar("Luis");
        nombres.encolar("María");
        System.out.println(nombres.desencolar()); // Ana
        System.out.println(nombres.frente()); // Luis
        System.out.println(nombres.tamanio()); // 2

        Queue<String> colaStr = new LinkedList<>();
        // Prueba también: Queue<String> colaStr = new ArrayDeque<>();
        // colaStr.offer("Ana");
        // colaStr.offer("Luis");
        // colaStr.offer("María");
        System.out.println(colaStr.peek()); // Ana (no la elimina)
        System.out.println(colaStr.poll()); // Ana (la elimina)
        System.out.println(colaStr.size()); // 2
        System.out.println(colaStr); // [Luis, María]
    

        Queue<Integer> pq = new java.util.PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq.poll()); // 10
        System.out.println(pq.poll()); // 20
        System.out.println(pq.poll()); // 30
    */
	Queue<String> cola = new LinkedList<>();

	        // Insertamos datos con offer()
	        cola.offer("Ana");
	        cola.offer("Luis");
	        cola.offer("María");
	
	        System.out.println(cola); // Salida: [Ana, Luis, María]
    }
	public static <T> void mostrarCola(Queue<T> cola) {
    int tam = cola.size();
    for (int i = 0; i < tam; i++) {
        T elemento = cola.poll();
        System.out.print(elemento + " ");
        cola.offer(elemento);
    }
    System.out.println();
}
}