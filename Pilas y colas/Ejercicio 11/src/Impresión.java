import java.util.Queue;
import java.util.LinkedList;

class Impresora {
    private int capacidadTinta;
    private Queue<String> documentos;

    public Impresora(int capacidadTinta) {
        this.capacidadTinta = capacidadTinta;
        this.documentos = new LinkedList<>();
    }

    public void encolarDocumento(String nombreDocumento) {
        documentos.add(nombreDocumento);
    }

    public void imprimirDocumentos() {
        if (documentos.isEmpty()) {
            System.out.println("No hay documentos encolados para imprimir.");
            return;
        }

        while (!documentos.isEmpty()) {
            String documento = documentos.poll();
            if (capacidadTinta > 0) {
                System.out.println("Imprimiendo documento: " + documento);
                capacidadTinta--;
            } else {
                System.out.println("No hay tinta suficiente para imprimir.");
                break;
            }
        }

        if (documentos.isEmpty()) {
            System.out.println("No hay más documentos en cola.");
        }
    }

    public void cargarTinta(int cantidadTinta) {
        capacidadTinta += cantidadTinta;
        System.out.println("Se han cargado " + cantidadTinta + " unidades de tinta.");
    }
}

public class Impresión {
    public static void main(String[] args) {
        Impresora impresora = new Impresora(5);

        impresora.encolarDocumento("Documento1");
        impresora.encolarDocumento("Documento2");
        impresora.encolarDocumento("Documento3");

        impresora.imprimirDocumentos();

        impresora.cargarTinta(3);

        impresora.imprimirDocumentos();
    }
}
