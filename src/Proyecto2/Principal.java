package Proyecto2;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        int accionJuego = -1;
        Scanner in = new Scanner(System.in);

        Posicion pIn =new Posicion(0,3);
        Posicion pOut = new Posicion(5, Habitacion.ALTO-1);
        ObjetoJuego puertaIn = new ObjetoJuego();
        puertaIn.setPos(pIn);
        puertaIn.setLetraMapa(' ');
        ObjetoJuego puertaOut = new ObjetoJuego();
        puertaOut.setPos(pOut);
        puertaIn.setLetraMapa(' ');

        Jugador jugador = new Jugador();
        jugador.setPos(pIn);
        jugador.setLetraMapa('J');
        Habitacion habInicial = new Habitacion();

        habInicial.setObjetosJ(jugador);
        habInicial.setObjetosJ(puertaIn);
        habInicial.setObjetosJ(puertaOut);

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