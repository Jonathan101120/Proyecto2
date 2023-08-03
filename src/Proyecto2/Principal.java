package Proyecto2;

public class Principal {
    public static void main(String[] args){
        //Creamos el objeto posInicial
        //Posicion posInicial = new Posicion();
        //En la clase Posicion tenemos los seters de PosX y PosY
        //posInicial.setPosX(3);
        //posInicial.setPosY(0);
        Posicion posInicial = new Posicion(3,0);
        //Generaremos los dos objetos
        Habitacion hab1 = new Habitacion();

        Personaje jugador = new Personaje();
        //Personaje tiene un seter que se le pasa la posicion inicial
        jugador.setPos(posInicial);
    }
}
