package colas;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        ColaEnlazada<String> fila = new ColaEnlazada<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("1. Llega un cliente");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Ver quién sigue");
            System.out.println("4. Ver cantidad en espera");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer de entrada
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = sc.nextLine();
                    fila.encolar(nombre);
                    System.out.println("-> Cliente " + nombre + " agregado a la fila.");
                    break;
                    
                case 2:
                    if (!fila.estaVacia()) {
                        String atendido = fila.desencolar();
                        System.out.println("-> Atendiendo a: " + atendido);
                    } else {
                        System.out.println("-> La fila está vacía. No hay clientes esperando.");
                    }
                    break;
                    
                case 3:
                    if (!fila.estaVacia()) {
                        System.out.println("-> El siguiente en la fila es: " + fila.frente());
                    } else {
                        System.out.println("-> La fila está vacía.");
                    }
                    break;
                    
                case 4:
                    System.out.println("-> Clientes en espera: " + fila.tamanio());
                    break;
                    
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                    
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);
        
        sc.close();
    }
}