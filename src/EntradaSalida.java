import javax.swing.*;
import java.util.Scanner;

/**
 * Libreria para sacar por dispositivos un mensaje y
 * pedir por consola distintos tipos de datos
 *
 * @author Damian Nogueiras
 * @version 0.1
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
     * opción de uso para mostrar el mensaje que solicita introducir datos por consola
     */
    public static final int ENTRADA_INT = 1;
    /**
     * opción de uso para mostrar el mensaje que solicita introducir datos por ventana
     */
    public static final int ENTRADA_STR = 2;

    private void EntradaSalida() {
    }

    ;

    /**
     * Salida por ventana o consala de un mensaje
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
     * TODO método para obtener distintos tipos de datos por consola
     *
     * @param comentario cadena de texto solicitada al usuario
     * @return mismo valor que ha introducido el usuario
     */
    public static boolean entrada(String comentario, int tipoDato) {
        Scanner input = new Scanner(System.in);
        int datoIntroducido = 0;
        String cadenaIntroducida = "";
        switch (tipoDato) {
            case ENTRADA_INT:
                try {
                    System.out.println(comentario);
                    datoIntroducido = input.nextInt();
                    return true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return false;
                }

            case ENTRADA_STR:
                try {
                    System.out.println(comentario);
                    cadenaIntroducida = input.nextLine();
                    return true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            default:
                return false;

        }
    }
}
