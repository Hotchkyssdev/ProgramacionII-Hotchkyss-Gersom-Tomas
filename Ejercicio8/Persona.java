package Ejercicio8;

import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private long DNI;
    private char sexo;
    private double peso;
    private double altura;

    // Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;

        generaDNI();
    }

    // Constructor con nombre, edad y sexo
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;

        generaDNI();
    }

    // Constructor con todos los atributos
    public Persona(String nombre, int edad, char sexo,
                   double peso, double altura) {

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;

        generaDNI();
    }

    // Calcula el IMC
    public int calcularIMC() {

        if (altura <= 0) {
            return 0;
        }

        double imc = peso / (altura * altura);

        if (imc < 20) {
            return -1;
        } else if (imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    // Comprueba si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Comprueba que el sexo sea H o M
    private char comprobarSexo(char sexo) {

        sexo = Character.toUpperCase(sexo);

        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        }

        return 'H';
    }

    // Genera un DNI aleatorio
    private void generaDNI() {

        Random random = new Random();

        DNI = 10000000L + random.nextInt(90000000);
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public long getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {

        return "Nombre: " + nombre
                + "\nEdad: " + edad
                + "\nDNI: " + DNI
                + "\nSexo: " + sexo
                + "\nPeso: " + peso + " kg"
                + "\nAltura: " + altura + " m";
    }
}
