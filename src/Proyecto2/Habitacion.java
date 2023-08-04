package Proyecto2;

public class Habitacion {
    public static final int ANCHO = 10;
    public static final int ALTO = 10;
    private Posicion puertaEntrada;
    private Posicion puertaSalida;
    private Personaje j;
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
    public void setJugador(Personaje j){
        this.j = j;
    }
}
