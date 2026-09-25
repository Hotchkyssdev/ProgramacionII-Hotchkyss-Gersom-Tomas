package GuiaEjercicios2.POO.Tema1.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        EmpleadoAsalariado empleado1 =
                new EmpleadoAsalariado("Juan", 101, 500000, 100000);
        EmpleadoAsalariado empleado2 =
                new EmpleadoAsalariado("Maria", 102);

        System.out.println("Empleado 1:");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Sueldo: " + empleado1.calcularSueldo());

        System.out.println();

        System.out.println("Empleado 2:");
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Sueldo: " + empleado2.calcularSueldo());

        /*
         * SOBRECARGA:
         *
         * new EmpleadoAsalariado("Juan", 101, 500000, 100000)
         * utiliza el constructor con cuatro parámetros.
         *
         * new EmpleadoAsalariado("Maria", 102)
         * utiliza el constructor con dos parámetros.
         *
         * Los dos constructores tienen el mismo nombre
         * pero distinta firma. La elección del constructor
         * se realiza en tiempo de compilación.
         *
         *
         * SOBRESCRITURA:
         *
         * calcularSueldo() está definido en Empleado y
         * es sobrescrito en EmpleadoAsalariado.
         *
         * Por ejemplo:
         *
         * Empleado empleado = new EmpleadoAsalariado("Pedro", 103);
         *
         * empleado.calcularSueldo();
         *
         * Aunque la referencia es de tipo Empleado,
         * se ejecuta el calcularSueldo() de EmpleadoAsalariado
         * porque el objeto real es un EmpleadoAsalariado.
         *
         * En este caso la decisión se realiza en tiempo de ejecución.
         */
    } 
}