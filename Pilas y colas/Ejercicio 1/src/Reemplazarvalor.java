import java.util.Scanner;
import java.util.Stack;

public class Reemplazarvalor {
    public static void Reemplazar(Stack<Integer> pila, int nuevo, int viejo) {
        Stack<Integer> pilaAuxiliar = new Stack<>();

        while (!pila.isEmpty()) {
            int valor = pila.pop();
            if (valor == viejo) {
                pilaAuxiliar.push(nuevo);
            } else {
                pilaAuxiliar.push(valor);
            }
        }

        while (!pilaAuxiliar.isEmpty()) {
            pila.push(pilaAuxiliar.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(2);
        pila.push(6);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor nuevo: ");
        int nuevo = scanner.nextInt();

        System.out.print("Ingrese el valor viejo: ");
        int viejo = scanner.nextInt();

        System.out.println("Pila original: " + pila);
        Reemplazar(pila, nuevo, viejo);
        System.out.println("Pila modificada: " + pila);

        scanner.close();
    }
}