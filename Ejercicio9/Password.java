package Ejercicio9;

import java.util.Random;

public class Password {

    private int longitud;
    private String contraseña;

    // Constructor por defecto
    public Password() {
        longitud = 8;
        generarPassword();
    }

    // Constructor con longitud
    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    // Comprueba si la contraseña es fuerte
    public boolean esFuerte() {

        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < contraseña.length(); i++) {

            char caracter = contraseña.charAt(i);

            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            }
        }

        return mayusculas > 2
                && minusculas > 1
                && numeros > 5;
    }

    // Genera una contraseña aleatoria
    public void generarPassword() {

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789";

        Random random = new Random();

        String resultado = "";

        for (int i = 0; i < longitud; i++) {
            int posicion = random.nextInt(caracteres.length());
            resultado += caracteres.charAt(posicion);
        }

        contraseña = resultado;
    }

    // Getters
    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    // Setter
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}