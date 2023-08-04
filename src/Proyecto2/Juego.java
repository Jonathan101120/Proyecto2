package Proyecto2;

public class Juego {
    public Juego(){

    }
    public static void pintarHabitacion(Habitacion h){
        for(int fila = 0; fila < Habitacion.ALTO; fila++){
            for(int columna = 0; columna < Habitacion.ANCHO; columna++){
                if(columna == 0 || columna == Habitacion.ANCHO-1)
                    System.out.print("|");
                else if(fila == 0 || fila == Habitacion.ALTO-1)
                    System.out.print("=");
                else
                    System.out.print(" ");
                if(columna == Habitacion.ANCHO-1)
                    System.out.println();
            }
        }
    }
}
