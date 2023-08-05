package Proyecto2;

public class ObjetoJuego {
    private String nombre;
    private Posicion pos;
    private char letraMapa = ' ';
    public ObjetoJuego(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPos() {
        return pos;
    }

    public void setPos(Posicion pos) {
        this.pos = pos;
    }

    public char getLetraMapa() {
        return letraMapa;
    }

    public void setLetraMapa(char letraMapa) {
        this.letraMapa = letraMapa;
    }
}
