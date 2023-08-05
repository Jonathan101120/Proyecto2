package Proyecto2;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        int accionJuego = -1;
        Scanner in = new Scanner(System.in);

        Posicion puertaIn =new Posicion(0,3);
        Posicion puertaOut = new Posicion(5, Habitacion.ALTO-1);


        Jugador jugador = new Jugador();
        Habitacion habInicial = new Habitacion(puertaIn,puertaOut,jugador);

        while (accionJuego != Juego.SALIR_JUEGO){
            Juego.pintarHabitacion(habInicial);
            Juego.pintarMenu();

            accionJuego = in.nextInt();
            switch (accionJuego){
                case Juego.LANZAR_DADO :
                    int numMov = Juego.lanzarDado();
                    System.out.print("[MOVIMIENTO COLUMNAS/X] ¿Cuantas columnas quieres moverte? Tienes "+numMov+" movimientos");
                    int numColumnas = in.nextInt();
                    jugador.movX(numColumnas);
                    numMov = numMov - numColumnas;
                    System.out.print("[MOVIMIENTO FILAS/Y] ¿Cuantas filas quieres moverte? Tienes "+numMov+" movimientos");
                    int numFiles = in.nextInt();
                    jugador.movY(numFiles);
                    break;
            }
        }
    }
}