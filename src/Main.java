import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n--- MENÚ DE EQUIPO ---");
            System.out.println("1. Mostrar saludo");
            System.out.println("2. Mostrar información del grupo");
            System.out.println("3. Mostrar despedida");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            if (teclado.hasNextInt()) {
                opcion = teclado.nextInt();
            } else {
                teclado.next();
                System.out.println("Por favor, introduce un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("¡Hola a todos! Estamos iniciando nuestra práctica de Git.");
                    break;
                case 2:
                    System.out.println("Este es el grupo formado por: Guillermo e Ignacio.");
                    break;
                case 3:
                    System.out.println("¡Adiós! Gracias por usar nuestra aplicación.");
                    break;
                case 0:
                    System.out.println("Cerrando el programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }
        teclado.close();
    }
}