package POO.Tema1.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[4];

        empleados[0] = new Empleado("Juan", 105);
        empleados[1] = new Empleado("María", 102);
        empleados[2] = new Empleado("Pedro", 108);
        empleados[3] = new Empleado("Ana", 101);

        mostrarLegajos(empleados);
    }

    public static void mostrarLegajos(Empleado[] empleados) {
        int menor = empleados[0].getLegajo();
        int mayor = empleados[0].getLegajo();

        for (int i = 1; i < empleados.length; i++) {
            if (empleados[i].getLegajo() < menor) {
                menor = empleados[i].getLegajo();
            }

            if (empleados[i].getLegajo() > mayor) {
                mayor = empleados[i].getLegajo();
            }
        }

        System.out.println("Legajo más bajo: " + menor);
        System.out.println("Legajo más alto: " + mayor);
    }
}