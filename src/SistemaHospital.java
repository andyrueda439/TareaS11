import java.util.PriorityQueue;

class Paciente implements Comparable<Paciente> {

    String nombre;
    int prioridad;

    public Paciente(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Paciente otro) {
        return this.prioridad - otro.prioridad;
    }

    @Override
    public String toString() {
        return nombre + " - Prioridad: " + prioridad;
    }
}

public class SistemaHospital {

    public static void main(String[] args) {

        PriorityQueue<Paciente> pacientes = new PriorityQueue<>();

        pacientes.offer(new Paciente("Carlos", 2));
        pacientes.offer(new Paciente("Andy", 1));
        pacientes.offer(new Paciente("Gabriel", 3));
        pacientes.offer(new Paciente("Maverick", 1));
        pacientes.offer(new Paciente("Manuel", 2));
        pacientes.offer(new Paciente("Alexander", 3));

        System.out.println("Orden de atención:");

        while (!pacientes.isEmpty()) {
            System.out.println(pacientes.poll());
        }
    }
}
