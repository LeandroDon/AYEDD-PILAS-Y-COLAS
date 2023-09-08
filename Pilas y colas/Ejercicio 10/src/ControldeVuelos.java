import java.util.Queue;
import java.util.ArrayDeque;

class Aeropuerto {
    private Queue<String> Aterrizaje;
    private Queue<String> Despegue;

    public Aeropuerto() {
        Aterrizaje = new ArrayDeque<>();
        Despegue = new ArrayDeque<>();
    }

    public void Aterrizajes(String vuelo) {
        Aterrizaje.add(vuelo);
    }

    public void Despegues(String vuelo) {
        Despegue.add(vuelo);
    }

    public void Aterrizados() {
        while (!Aterrizaje.isEmpty()) {
            String vuelo = Aterrizaje.poll();
            System.out.println("El vuelo " + vuelo + " aterrizó con éxito.");
        }
    }

    public void Despegados() {
        while (!Despegue.isEmpty()) {
            String vuelo = Despegue.poll();
            System.out.println("El vuelo " + vuelo + " despegó con éxito.");
        }
    }

    public void EstadodeVuelos() {
        System.out.println("Vuelos esperando para aterrizar: " + Aterrizaje);
        System.out.println("Vuelos esperando para despegar: " + Despegue);
    }
}

public class ControldeVuelos {
    public static void main(String[] args) {
        Aeropuerto torre = new Aeropuerto();

        torre.Aterrizajes("AR156");
        torre.Aterrizajes("AR32");
        torre.Despegues("KLM1267");

        torre.EstadodeVuelos();

        torre.Aterrizados();
        torre.Despegados();

        torre.EstadodeVuelos();

        System.out.println("No hay vuelos en espera.");
    }
}
