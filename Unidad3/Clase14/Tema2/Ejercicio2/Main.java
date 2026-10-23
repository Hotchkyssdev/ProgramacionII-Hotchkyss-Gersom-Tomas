package Unidad3.Clase14.Tema2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        double promedioUnaCaja = simularUnaCaja();
        double promedioDosCajas = simularDosCajas();

        System.out.println("\n========== COMPARACIÓN ==========");
        System.out.printf("Promedio con una caja: %.2f minutos%n",
                promedioUnaCaja);
        System.out.printf("Promedio con dos cajas: %.2f minutos%n",
                promedioDosCajas);

        double diferencia = promedioUnaCaja - promedioDosCajas;

        System.out.printf("Reducción del promedio: %.2f minutos%n",
                diferencia);
    }

    public static ColaClientes crearCola() {

        ColaClientes cola = new ColaClientes();

        cola.encolar(new Cliente("Ana", 0, 5));
        cola.encolar(new Cliente("Bruno", 1, 3));
        cola.encolar(new Cliente("Carla", 2, 6));
        cola.encolar(new Cliente("Diego", 8, 2));
        cola.encolar(new Cliente("Elena", 9, 4));

        return cola;
    }

    public static double simularUnaCaja() {

        ColaClientes cola = crearCola();
        int finAnterior = 0;
        int sumaEsperas = 0;
        int cantidadClientes = 0;

        System.out.println("===== SIMULACIÓN CON UNA CAJA =====");

        while (!cola.estaVacia()) {

            Cliente cliente = cola.desencolar();

            int inicio;

            if (cliente.getLlegada() > finAnterior) {
                inicio = cliente.getLlegada();
            } else {
                inicio = finAnterior;
            }

            int espera = inicio - cliente.getLlegada();

            cliente.setInicioAtencion(inicio);
            cliente.setTiempoEspera(espera);
            cliente.setCajaAsignada(1);

            int fin = inicio + cliente.getDuracion();
            finAnterior = fin;

            sumaEsperas += espera;
            cantidadClientes++;

            System.out.println(cliente.getNombre()
                    + " | Caja 1 | Inicio: " + inicio
                    + " | Espera: " + espera);
        }

        double promedio = (double) sumaEsperas / cantidadClientes;

        System.out.printf("Promedio de espera: %.2f minutos%n%n",
                promedio);

        return promedio;
    }

    public static double simularDosCajas() {

        ColaClientes cola = crearCola();

        // Momento en que queda libre cada caja
        int finCaja1 = 0;
        int finCaja2 = 0;

        int sumaEsperas = 0;
        int cantidadClientes = 0;

        System.out.println("===== SIMULACIÓN CON DOS CAJAS =====");

        while (!cola.estaVacia()) {

            Cliente cliente = cola.desencolar();

            int llegada = cliente.getLlegada();
            int caja;
            int inicio;

            // Si ambas cajas están libres al llegar,
            // se elige la caja 1.
            if (finCaja1 <= llegada && finCaja2 <= llegada) {
                caja = 1;
                inicio = llegada;
            }

            // Si solamente la caja 1 está libre
            else if (finCaja1 <= llegada) {
                caja = 1;
                inicio = llegada;
            }

            // Si solamente la caja 2 está libre
            else if (finCaja2 <= llegada) {
                caja = 2;
                inicio = llegada;
            }

            // Si ambas están ocupadas, elegir la que
            // termine primero. En caso de empate, caja 1.
            else if (finCaja1 <= finCaja2) {
                caja = 1;
                inicio = finCaja1;
            }

            else {
                caja = 2;
                inicio = finCaja2;
            }

            int espera = inicio - llegada;
            int fin = inicio + cliente.getDuracion();

            cliente.setInicioAtencion(inicio);
            cliente.setTiempoEspera(espera);
            cliente.setCajaAsignada(caja);

            if (caja == 1) {
                finCaja1 = fin;
            } else {
                finCaja2 = fin;
            }

            sumaEsperas += espera;
            cantidadClientes++;

            System.out.println(cliente.getNombre()
                    + " | Caja " + caja
                    + " | Inicio: " + inicio
                    + " | Espera: " + espera);
        }

        double promedio = (double) sumaEsperas / cantidadClientes;

        System.out.printf("Promedio de espera: %.2f minutos%n",
                promedio);

        return promedio;
    }
}