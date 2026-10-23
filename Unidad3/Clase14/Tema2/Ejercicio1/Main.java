package Unidad3.Clase14.Tema2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ColaClientes cola = new ColaClientes();
        
        // Crear los clientes con llegada y duración conocidas
        cola.encolar(new Cliente("Ana", 0, 5));
        cola.encolar(new Cliente("Bruno", 1, 3));
        cola.encolar(new Cliente("Carla", 2, 6));
        cola.encolar(new Cliente("Diego", 8, 2));
        cola.encolar(new Cliente("Elena", 9, 4));

        int finAtencionAnterior = 0;

        Cliente mayorEspera = null;
        int esperaMaxima = -1;

        System.out.println("SIMULACIÓN DE ATENCIÓN EN UNA CAJA");
        System.out.println("-----------------------------------");

        while (!cola.estaVacia()) {

            Cliente cliente = cola.desencolar();

            // La atención comienza cuando llega el cliente
            // o cuando queda libre la caja, lo que ocurra después
            int inicio;

            if (cliente.getLlegada() > finAtencionAnterior) {
                inicio = cliente.getLlegada();
            } else {
                inicio = finAtencionAnterior;
            }

            int espera = inicio - cliente.getLlegada();
            int fin = inicio + cliente.getDuracion();

            cliente.setInicioAtencion(inicio);
            cliente.setTiempoEspera(espera);

            System.out.println("\nCliente: " + cliente.getNombre());
            System.out.println("Llegada: " + cliente.getLlegada());
            System.out.println("Duración: " + cliente.getDuracion());
            System.out.println("Inicio de atención: " + inicio);
            System.out.println("Tiempo de espera: " + espera);
            System.out.println("Fin de atención: " + fin);

            if (espera > esperaMaxima) {
                esperaMaxima = espera;
                mayorEspera = cliente;
            }

            // Registrar cuándo queda libre la caja
            finAtencionAnterior = fin;
        }

        System.out.println("\n-----------------------------------");
        System.out.println("CLIENTE CON MAYOR TIEMPO DE ESPERA");
        System.out.println("Nombre: " + mayorEspera.getNombre());
        System.out.println("Tiempo de espera: "
                + mayorEspera.getTiempoEspera() + " minutos");
    }
}