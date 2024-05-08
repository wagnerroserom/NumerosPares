import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor ingresa un número:"); // Con esta instrucción solicitamos al usuario que ingrese un número cualquiera.
        int numeroIngresado = scanner.nextInt();
       
        System.out.println("Números pares entre 1 y " + numeroIngresado + ":"); // Con esta instrucción mostramos los números pares entre 1 y el número ingresado.

        for (int i = 2; i <= numeroIngresado; i += 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}