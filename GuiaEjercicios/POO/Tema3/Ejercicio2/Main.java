package POO.Tema3.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Concesionaria concesionaria = new Concesionaria("Autos del Norte");
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 25000000);
        Vehiculo vehiculo2 = new Vehiculo("Ford", "Focus", 18000000);
        Vehiculo vehiculo3 = new Vehiculo("Volkswagen", "Golf", 22000000);
        Vehiculo vehiculo4 = new Vehiculo("Chevrolet", "Cruze", 20000000);
        Vehiculo vehiculo5 = new Vehiculo("Fiat", "Cronos", 16000000);

        concesionaria.agregarVehiculo(vehiculo1);
        concesionaria.agregarVehiculo(vehiculo2);
        concesionaria.agregarVehiculo(vehiculo3);
        concesionaria.agregarVehiculo(vehiculo4);
        concesionaria.agregarVehiculo(vehiculo5);

        Vehiculo encontrado = concesionaria.buscarPorMarca("Ford");
        if (encontrado != null) {
            System.out.println("Vehiculo encontrado:");
            System.out.println(encontrado);
        } else {
            System.out.println("No se encontro ningun vehiculo");
        }

        Vehiculo noEncontrado = concesionaria.buscarPorMarca("Honda");
        if (noEncontrado != null) {
            System.out.println("Vehiculo encontrado:");
            System.out.println(noEncontrado);
        } else {
            System.out.println("No se encontro ningun vehiculo");
        }

        System.out.println("Valor total del stock: $" + String.format("%.0f", concesionaria.valorTotalStock()));
    }
}