package RepasoParcialI.Ejercicio2;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    private static final char SEXO_POR_DEFECTO = 'H';

    private static final int BAJO_PESO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBREPESO = 1;

    private static final int EDAD_MAYORIA = 18;

    // Constructor con DNI y nombre
    public Persona(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = "";
        this.edad = 0;
        this.sexo = SEXO_POR_DEFECTO;
        this.peso = 0;
        this.altura = 0;
    }

    // Constructor con DNI, nombre, apellido, edad y sexo
    public Persona(String DNI, String nombre, String apellido, int edad, char sexo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
    }

    // Constructor con todos los atributos
    public Persona(String DNI, String nombre, String apellido, int edad,
                   char sexo, double peso, double altura) {

        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {

        if (altura <= 0) {
            return PESO_IDEAL;
        }

        double IMC = peso / (altura * altura);

        if (IMC < 20) {
            return BAJO_PESO;
        } else if (IMC <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= EDAD_MAYORIA;
    }

    private char comprobarSexo(char sexo) {

        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        }

        return SEXO_POR_DEFECTO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
