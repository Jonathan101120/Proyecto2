package Proyecto2;
import java.util.concurrent.ThreadLocalRandom;
public class Juego {
    final static int LANZAR_DADO = 1;
    final static int SALIR_JUEGO = 0;
    public Juego(){

    }
    public static void pintarHabitacion(Habitacion h){
        for(int fila = -1; fila < Habitacion.ALTO; fila++){
            for(int columna = 0; columna <= Habitacion.ANCHO; columna++){
                Posicion posicionActual = new Posicion(columna,fila);
                if(h.esunJugador(posicionActual))
                    System.out.print("J");
                else if(fila == -1 && columna != Habitacion.ANCHO) System.out.print(columna);
                else if(columna == Habitacion.ANCHO && fila != -1) System.out.print(fila);
                else if(h.esunaPuerta(posicionActual)) System.out.print(" ");
                else if(columna == 0 || columna == Habitacion.ANCHO-1) System.out.print("|");
                else if(fila == 0 || fila == Habitacion.ALTO-1) System.out.print("=");
                else System.out.print(" ");
                if(columna == Habitacion.ANCHO)
                    System.out.println();
            }
        }
    }
    public static void pintarMenu(){
        System.out.println("-------------- HOLOCAUSTO H (HADRON) --------------");
        System.out.println("[1] LANZAR DADO DE MOVIMIENTO");
        System.out.println("[0] SALIR DEL JUEGO");
        System.out.println("---------------------------------------------------");
    }
    public static int lanzarDado(){
        int dado = ThreadLocalRandom.current().nextInt(1,7);
        System.out.println("Dado lanzado: " + dado);
        return dado;
    }
}






