package Proyecto2;

public class Habitacion {
    public static final int ANCHO = 6;
    public static final int ALTO = 6;
    private Posicion puertaEntrada;
    private Posicion puertaSalida;
    public Habitacion(){
        System.out.println("Estamos en habitacion");
    }
    public Posicion getPuertaEntrada() {
        return puertaEntrada;
    }

    public void setPuertaEntrada(Posicion puertaEntrada) {
        this.puertaEntrada = puertaEntrada;
    }
    public Posicion getPuertaSalida(){
        return puertaSalida;
    }
    public void setPuertaSalida(Posicion puertaSalida){
        this.puertaSalida = puertaSalida;
    }
}
