import java.util.LinkedList;
import java.util.Queue;

public class GestionTurno {

    public static void main(String[] args) {

        Queue<String> colaClientes = new LinkedList<>();


        colaClientes.offer("Ana");
        colaClientes.offer("José");
        colaClientes.offer("Hendrix");
        colaClientes.offer("Kellys");
        colaClientes.offer("Raúl");
        colaClientes.offer("Marco");
        colaClientes.offer("Nora");
        colaClientes.offer("Manuel");


        while (!colaClientes.isEmpty()) {


            System.out.println("En espera: " + colaClientes.peek());


            String clienteAtendido = colaClientes.poll();
            System.out.println("Cliente atendido: " + clienteAtendido);


            System.out.println("Clientes restantes: " + colaClientes.size());

            System.out.println("----------------------");
        }
    }
}
