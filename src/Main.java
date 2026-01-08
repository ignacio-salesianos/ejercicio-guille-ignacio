import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n--- MENÚ DE EQUIPO ---");
            System.out.println("1. Mostrar saludo");
            System.out.println("2. Mostrar información del grupo");
            System.out.println("3. Mostrar despedida");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion=Leer.datoInt();

            switch (opcion) {
                case 1:
                    Funciones.mostrarSaludo();
                    break;
                case 2:
                    Funciones.mostrarInfo();
                    break;
                case 3:
                    Funciones.mostrarDespedida();
                    break;
                case 0:
                    System.out.println("Cerrando el programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }
    }
}