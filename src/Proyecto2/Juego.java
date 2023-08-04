package Proyecto2;

public class Juego {
    public Juego(){

    }
    public static void pintarHabitacion(Habitacion h){
        for(int fila = 0;fila < Habitacion.ALTO;fila++){
            for(int columna = 0;columna < Habitacion.ANCHO;columna++){
                if(columna == 0 || columna == Habitacion.ANCHO-1)
                    System.out.println("|");
                else if(fila == 0 || fila == Habitacion.ALTO-1)
                    System.out.println("=");
                else
                    System.out.println(" ");
                if(columna == Habitacion.ANCHO-1)
                    System.out.println();
            }
        }
    }
}
