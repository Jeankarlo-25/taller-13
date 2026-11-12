public interface observable {
    public void suscribir(Observer o);
    public void desuscribir(Observer o);
    public void notificar(String mensaje);
}