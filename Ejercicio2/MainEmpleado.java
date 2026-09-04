public class MainEmpleado {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[4];

        empleados[0] = new Empleado("Juan", 105);
        empleados[1] = new Empleado("Pedro", 102);
        empleados[2] = new Empleado("Maria", 108);
        empleados[3] = new Empleado("Aba", 101);

        System.out.println("Empleados: ");

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        int legajomenor = empleados[0].getLegajo();
        int legajomayor = empleados[0].getLegajo();

        for (int i = 1; i < empleados.length; i++) {
            if (empleados[i].getLegajo() < legajomenor) {
                legajomenor = empleados[i].getLegajo();
            }
            if (empleados[i].getLegajo() > legajomayor) {
                legajomayor = empleados[i].getLegajo();
            }
        }

        System.out.println("\nLegajo mas bajo: " + legajomenor);
        System.out.println("Legajo mas alto: " + legajomayor);

        System.out.println("\nSueldos:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + ": $" + empleado.calcularSueldo());
        }
    }
}