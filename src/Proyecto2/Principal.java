package Proyecto2;

public class Principal {
    public static void main(String[] args){
        Habitacion habInicial = new Habitacion();

        Posicion puertaIn =new Posicion(0,3);
        habInicial.setPuertaEntrada(puertaIn);

        Posicion puertaOut = new Posicion(5, Habitacion.ALTO-1);
        habInicial.setPuertaEntrada(puertaOut);

        Personaje jugador = new Personaje();
        habInicial.setJugador(jugador);

        Juego.pintarHabitacion(habInicial);
    }
}