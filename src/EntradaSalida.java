import javax.swing.*;

public class EntradaSalida {

    static final int SALIDA_CONSOLA = 1;
    static final int SALIDA_WINDOW = 2;

    /**
     * Salida por ventana o consala de un mensaje
     * @param msj cadena que queremos imprimir
     * @param device dispositivo de salida, consola (SALIDA_CONSOLA) o ventana (SALIDA_VENTANA)
     * @return si es true: correcto si no false
     */
    static boolean salida(String msj, int device) {
        switch (device) {
            case SALIDA_CONSOLA:
                // TODO: try catch
                System.out.println("Consola: " + msj);
                return true;
            case SALIDA_WINDOW:
                JOptionPane.showMessageDialog(null,"Sale por un ventana " + msj);
                return true;
            default:
                return false;
        }
    }
}
