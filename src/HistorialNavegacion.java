import java.util.Deque;
import java.util.LinkedList;

public class HistorialNavegacion {

    public static void main(String[] args) {

        Deque<String> historial = new LinkedList<>();

        historial.addLast("Google");
        historial.addLast("YouTube");
        historial.addLast("Netlix");

        System.out.println("Historial actual: " + historial);

        String paginaActual = historial.removeLast();
        System.out.println("Retrocediendo desde: " + paginaActual);

        System.out.println("Página actual: " + historial.peekLast());

        historial.addLast(paginaActual);

        System.out.println("Avanzando a: " + historial.peekLast());

        System.out.println("Historial final: " + historial);
    }
}
