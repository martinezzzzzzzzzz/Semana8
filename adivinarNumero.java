import java.util.Random;
import java.util.Scanner;

public class adivinarNumero {

    public static void main(String[] args) {
        adivinarNumero(1, 100, 5);
    }

    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(max_numero - min_numero + 1) + min_numero;
        System.out.println("¡Comienza el juego! Adivina el número entre " + min_numero + " y " + max_numero);

        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        while (intentos < max_intentos) {
            System.out.print("Introduce un número: ");
            int numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                return;
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número aleatorio es mayor.");
            } else {
                System.out.println("El número aleatorio es menor.");
            }
        }

        System.out.println("¡Lo siento! Has alcanzado el número máximo de intentos.");
        System.out.println("El número aleatorio era: " + numeroAleatorio);
    }
}
