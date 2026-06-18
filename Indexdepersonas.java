package utils;

import java.util.Scanner;

/**
 *
 * @author naara
 */
public class Lectura {

    private Scanner teclado = new Scanner(System.in);

    public String cadena() {
        return teclado.nextLine();
    }

    public String cadenamayuscula() {
        return cadena().toUpperCase();
    }

    public String cadenaminusculas() {
        return cadena().toLowerCase();
    }

    public int entero() {
        return Integer.parseInt(cadena());
    }

    public double decimal() {
        return Double.parseDouble(cadena());
    }

    public char letra() {
        return cadena().charAt(0);
    }

    public void cerrar() {
        teclado.close();
    }
}
