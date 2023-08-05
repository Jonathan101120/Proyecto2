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
    public Habitacion(Posicion puertaIn, Posicion puertaOut, Personaje j){
        this.puertaEntrada = puertaIn;
        this.puertaSalida = puertaOut;
        this.j = j;
        this.j.setPos(this.puertaEntrada);
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
    public boolean esunaPuerta(Posicion p){
        if(p.esIgual(puertaEntrada) || p.esIgual(puertaSalida))
            return true;
        return false;
    }
    public boolean esunJugador(Posicion p){
        if (p.esIgual(this.j.getPos()))
            return true;
        return false;
    }
}
