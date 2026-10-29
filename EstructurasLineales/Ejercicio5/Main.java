package EstructurasLineales.Ejercicio5;

public class Main {
    public static void main(String[] args) {

        ColaDinamica cola = new ColaDinamica();

        int clientesAtendidos = 0;
        int tiempoAtencion = 0;
        int clientesEnAtencion = 0;

        int duracionSimulacion = 600;
        int tiempoPorCliente = 4;
        int intervaloLlegadas = 2;

        for (int minuto = 0; minuto < duracionSimulacion; minuto++) {

            // Cada 2 minutos llega un cliente.
            if (minuto % intervaloLlegadas == 0) {
                cola.encolar(minuto);
            }

            // Si el cajero está libre, comienza a atender
            // al primer cliente de la cola.
            if (clientesEnAtencion == 0 && !cola.estaVacia()) {
                cola.desencolar();
                clientesEnAtencion = 1;
                tiempoAtencion = tiempoPorCliente;
            }

            // Transcurre un minuto de atención.
            if (clientesEnAtencion == 1) {
                tiempoAtencion--;

                // Si terminó la atención, se cuenta el cliente.
                if (tiempoAtencion == 0) {
                    clientesAtendidos++;
                    clientesEnAtencion = 0;
                }
            }
        }

        System.out.println("SIMULACION DEL CAJERO AUTOMATICO");
        System.out.println("--------------------------------");
        System.out.println("Duracion: 10 horas");
        System.out.println("Clientes atendidos: " + clientesAtendidos);
        System.out.println("Clientes en cola: " + cola.tamanio());

        if (!cola.estaVacia()) {
            int llegada = cola.consultarPrimero();

            System.out.println(
                "Llegada del primer cliente no atendido: minuto "
                + llegada
            );

            System.out.println(
                "Hora desde el inicio: "
                + (llegada / 60) + " horas y "
                + (llegada % 60) + " minutos"
            );
        }
    }
}