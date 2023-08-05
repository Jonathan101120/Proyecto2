package Proyecto2;

public class Personaje extends ObjetoJuego{

    public Personaje(){
        System.out.println("Creamos un personaje.");
    }

    public void movX(int X){
        Posicion pos = super.getPos();
        pos.setPosX(pos.getPosX()+X);
    }
    public void movY(int Y) {
        Posicion pos = super.getPos();
        pos.setPosY(pos.getPosY()+Y);
    }
}