import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Scanner;

public class InvertirCola {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese números para la cola (Ingrese '0' para finalizar):");

        int valor;
        while ((valor = scanner.nextInt()) != 0) {
            q.add(valor);
        }

        System.out.println("Cola original: " + q);

        invertirCola(q);

        System.out.println("Cola invertida: " + q);

        scanner.close();
    }

    public static void invertirCola(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }

        Queue<Integer> aux = new ArrayDeque<>();

        while (!q.isEmpty()) {
            aux.add(q.poll());
        }

        while (!aux.isEmpty()) {
            q.add(aux.poll());
        }
    }
}
