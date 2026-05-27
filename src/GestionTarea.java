import java.util.Deque;
import java.util.LinkedList;

public class GestionTarea {

    public static void main(String[] args) {

        Deque<String> tareas = new LinkedList<>();

        tareas.offerLast("Revisar correos");
        tareas.offerLast("Actualizar reporte");

        tareas.offerFirst("Reiniciar servidor");
        tareas.offerFirst("Resolver caída del sistema");

        System.out.println("Orden de tareas:");
        System.out.println(tareas);

        System.out.println("\nProcesando tareas:");

        while (!tareas.isEmpty()) {

            String tarea = tareas.pollFirst();

            System.out.println("Procesando: " + tarea);
        }
    }
}