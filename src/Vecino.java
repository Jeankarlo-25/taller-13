import java.util.ArrayList;
import java.util.List;

public class Vecino implements Observable {
    private final String nombre;
    private final List<Observer> observadores = new ArrayList<>();

    public Vecino(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void suscribir(Observer o) {
        if (!observadores.contains(o)) {
            observadores.add(o);
        }
    }

    @Override
    public void desuscribir(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre + " recibió: " + mensaje);
        if (mensaje.contains("Hay pan")) {
            System.out.println(nombre + ": voy a comprar pan.");
        }
        for (Observer o : observadores) {
            o.actualizar(mensaje);
        }
    }
}