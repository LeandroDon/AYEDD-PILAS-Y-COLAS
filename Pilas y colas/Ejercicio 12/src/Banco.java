import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> Pares = new LinkedList<>();
        Queue<Integer> Impares = new LinkedList<>();

        System.out.print("Ingrese la cantidad de clientes: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el DNI del cliente " + (i + 1) + ": ");
            int dni = scanner.nextInt();

            if (dni % 2 == 0) {
                Pares.offer(dni);
            } else {
                Impares.offer(dni);
            }
        }

        scanner.close();

        System.out.println("Clientes con DNI terminado en número par:");
        while (!Pares.isEmpty()) {
            System.out.println(Pares.poll());
        }

        System.out.println("\nClientes con DNI terminado en número impar:");
        while (!Impares.isEmpty()) {
            System.out.println(Impares.poll());
        }
    }
}
