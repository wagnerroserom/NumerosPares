
import java.util.Scanner;

public class ContadorNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Con esta instrucción solicitamos al usuario que ingrese un número cualquiera.
        System.out.println("Por favor ingresa un número:");
        int numeroIngresado = scanner.nextInt();

        // Con esta instrucción mostramos los números pares entre 1 y el número ingresado
        System.out.println("Números pares entre 1 y " + numeroIngresado + ":");

        for (int i = 2; i <= numeroIngresado; i += 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}
