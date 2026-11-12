public class Main {
    public static void main(String[] args) {
        Vecino vecino = new Vecino("Ana");
        Panaderia panaderia = new Panaderia(vecino);

        vecino.suscribir(panaderia);      // suscribir

        panaderia.sacarPan();             // Ana recibe aviso y panadería es notificada

        vecino.desuscribir(panaderia);    // desuscribir

        panaderia.agotarPan();            // Ana recibe aviso, panadería ya no
    }
}