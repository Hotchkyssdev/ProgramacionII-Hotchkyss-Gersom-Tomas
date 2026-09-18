package sistemaliquidacionsueldo;

public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];

        empleados[0] = new EmpleadoPorHoras("Juan", 101, 40, 5000);
        empleados[1] = new EmpleadoPorComisiones("Pedro", 102, 300000, 1000000, 5);
        empleados[2] = new EmpleadoPorHoras("María", 103, 35, 6000);

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}