import javax.swing.*;
import java.util.Scanner;

/**
 * Libreria para sacar por dispositivos un mensaje y
 * pedir por consola distintos tipos de datos
 *
 * @author Sara
 * @version 0.2
 */
public class EntradaSalida {
    /**
     * opción de uso de la consola para imprimir un mensaje
     */
    public static final int SALIDA_CONSOLA = 1;
    /**
     * opción de uso de utilizar una ventana en el escritorio para sacar un mensaje
     */
    public static final int SALIDA_WINDOW = 2;

    /**
     * opción de uso para determinar si se debe introducir un entero
     */
    public static final int ENTRADA_INT = 1;
    /**
     * opción de uso para determinar si se debe introducir un string
     */
    public static final int ENTRADA_STR = 2;

    private void EntradaSalida() {
    }

    ;

    /**
     * Salida por ventana o consola de un mensaje
     *
     * @param msj    cadena que queremos imprimir
     * @param device dispositivo de salida<br>consola: SALIDA_CONSOLA<br>ventana:SALIDA_VENTANA
     * @return si es true: correcto si no false
     */
    public static boolean salida(String msj, int device) {
        switch (device) {
            case SALIDA_CONSOLA:
                try {
                    System.out.println("Consola: " + msj);
                    return true;
                } catch (Exception e) {
                    return false;
                }

            case SALIDA_WINDOW:
                try {
                    JOptionPane.showMessageDialog(null, "Sale por un ventana " + msj);
                    return true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            default:
                return false;
        }
    }

    /**
     * Método para obtener un String por consola
     *
     * @param comentario cadena de texto que solicita el String al usuario
     * @return devuelve el texto introducido por el usuario
     */
    public static String entradaStr(String comentario) {
        Scanner input = new Scanner(System.in);
        String cadenaIntroducida = "";
        try {
            System.out.println(comentario);
            cadenaIntroducida = input.nextLine();
            return cadenaIntroducida;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error al introducir el texto.");
            return null;
        }
    }

    /**
     * Método para obtener un int por consola
     *
     * @param comentario cadena de texto que solicita el int al usuario
     * @return devuelve el número introducido por el usuario
     */
    public static Integer entradaInt(String comentario) {
        Scanner input = new Scanner(System.in);
        Integer numIntroducido = 0;
        try {
            System.out.println(comentario);
            numIntroducido = input.nextInt();
            return numIntroducido;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error al introducir el número.");
            return null;
        }
    }
}

