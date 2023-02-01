import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isOK_ventana = false;
        boolean isOK_consola = false;
        String entradaUsuario = "";

        isOK_consola = EntradaSalida.salida("Hola", EntradaSalida.SALIDA_CONSOLA);
        if (!isOK_consola) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSalida.salida("Hello world", EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana) System.out.println("ERROR VENTANA");

        boolean isOK_int=false;
        boolean isOK_str=false;
        isOK_int= EntradaSalida.entrada("Introduzca un entero: ", EntradaSalida.ENTRADA_INT);
        if(!isOK_int) System.out.println("Error INT");
        isOK_str= EntradaSalida.entrada("Introduzca una cadena de caracteres: ", EntradaSalida.ENTRADA_STR);
        if (!isOK_str) System.out.println("Error String");

    }
}