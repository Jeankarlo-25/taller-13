public class Panaderia implements Observer {
    private String estado = "Sin pan";
    private boolean hayPan = false;
    private final Vecino vecino;

    public Panaderia(Vecino vecino) {
        this.vecino = vecino;
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        vecino.notificar(estado); // avisa cada vez que cambia el string
    }

    public void sacarPan() {
        hayPan = true;
        System.out.println(">> Salio el pan caliente");
        setEstado("¡Hay pan caliente!");
    }

    public void agotarPan() {
        hayPan = false;
        setEstado("Sin pan");
    }

    public boolean hayPan() {
        return hayPan;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public void actualizar(String notificacion) {
        System.out.println("Panadería se enteró: " + notificacion);
    }
}