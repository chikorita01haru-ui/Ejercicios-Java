import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        // Proceso
        int suma = num1 + num2;

        // Mostrar resultado
        System.out.println("La suma es: " + suma);
    }
}