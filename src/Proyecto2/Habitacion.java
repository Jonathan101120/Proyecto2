package Proyecto2;

public class Habitacion {
    private Posicion puertaEntrada;
    public Habitacion(){
        System.out.println("Estamos en habitacion");
    }
    public Posicion getPuertaEntrada() {
        return puertaEntrada;
    }

    public void setPuertaEntrada(Posicion puertaEntrada) {
        this.puertaEntrada = puertaEntrada;
    }
}
