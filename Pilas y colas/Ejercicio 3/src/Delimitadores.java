import java.util.Stack;

public class Delimitadores {
    public static boolean delimitadoresBalanceados(String expresión) {
        Stack<Character> pila = new Stack<>();

        for (char delimitador : expresión.toCharArray()) {
            if (delimitador == '(' || delimitador == '{' || delimitador == '[') {
                pila.push(delimitador);
            } else if (delimitador == ')' || delimitador == '}' || delimitador == ']') {
                if (pila.isEmpty()) {
                    return false;
                }
                char almacenaDelimitador = pila.pop();
                if (!Comparación(almacenaDelimitador, delimitador)) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }
    private static boolean Comparación(char abrir, char cerrar) {
        return (abrir == '(' && cerrar == ')') ||
               (abrir == '{' && cerrar == '}') ||
               (abrir == '[' && cerrar == ']');
    }

    public static void main(String[] args) {
        String expresión1 = "{([()])}";
        String expresión2 = "({[])}";

        System.out.println("Expresión 1 está balanceada: " + delimitadoresBalanceados(expresión1));
        System.out.println("Expresión 2 está balanceada: " + delimitadoresBalanceados(expresión2));
    }
}
