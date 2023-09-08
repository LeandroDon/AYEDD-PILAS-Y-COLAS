import java.util.ArrayDeque;
import java.util.Queue;

public class ColaconPrioridad {
    private Queue<Integer> colaconPrioridad;
    private Queue<Integer> colasinPrioridad;

    public ColaconPrioridad() {
        colaconPrioridad = new ArrayDeque<>();
        colasinPrioridad = new ArrayDeque<>();
    }

    public void encolarConPrioridad(int valor) {
        colaconPrioridad.add(valor);
    }

    public void encolarSinPrioridad(int valor) {
        colasinPrioridad.add(valor);
    }

    public int desencolar() {
        if (!colaconPrioridad.isEmpty()) {
            return colaconPrioridad.poll();
        } else if (!colasinPrioridad.isEmpty()) {
            return colasinPrioridad.poll();
        } else {
            throw new IllegalStateException("La cola está vacía.");
        }
    }

    public boolean estaVacia() {
        return colaconPrioridad.isEmpty() && colasinPrioridad.isEmpty();
    }

    public static void main(String[] args) {
        ColaconPrioridad cola = new ColaconPrioridad();

        cola.encolarConPrioridad(32);
        cola.encolarConPrioridad(15);

        cola.encolarSinPrioridad(8);
        cola.encolarSinPrioridad(24);
        cola.encolarSinPrioridad(51);

        while (!cola.estaVacia()) {
            System.out.println("Desencolando: " + cola.desencolar());
        }
    }
}
