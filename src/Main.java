import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isOK_ventana = false;
        boolean isOK_consola = false;


        isOK_consola = EntradaSalida.salida("Hola", EntradaSalida.SALIDA_CONSOLA);
        if (!isOK_consola) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSalida.salida("Hello world", EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana) System.out.println("ERROR VENTANA");

        int inputUserInt = 0;
        String inputUserStr = "";
        Scanner inputUser = new Scanner(System.in);
        int opcionInput = 0;
        System.out.println("Pulsa 1 para introducir un número y 2 para introducir texto:");
        opcionInput = inputUser.nextInt();
        switch (opcionInput) {
            case EntradaSalida.ENTRADA_INT:
                inputUserInt = EntradaSalida.entradaInt("Introduzca un número: ");
                break;

            case EntradaSalida.ENTRADA_STR:
                inputUserStr = EntradaSalida.entradaStr("Introduzca una cadena de caracteres: ");
                break;
        }
    }
}