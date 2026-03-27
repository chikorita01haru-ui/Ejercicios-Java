import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir número al usuario
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        // Verificar si es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número es PAR");
        } else {
            System.out.println("El número es IMPAR");
        }

        scanner.close();
    }
}