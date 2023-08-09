package Proyecto2;

public class Habitacion {
    public static final int ANCHO = 10;
    public static final int ALTO = 10;
    private Posicion puertaEntrada;
    private Posicion puertaSalida;
    private ObjetoJuego[] objetosJ = new ObjetoJuego[20];
    private int numObjetos = 0;
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
    public void setObjetosJ(ObjetoJuego obj){
        objetosJ[numObjetos] = obj;
        numObjetos++;
    }
    public ObjetoJuego getObjetosJ(int objPos){
        return objetosJ[objPos];
    }
    public int hayObjeto(Posicion p){
        for (int i = 0; i<numObjetos; i++){
            ObjetoJuego obj = objetosJ[i];
            Posicion objPosicion = obj.getPos();
            if (p.esIgual(objPosicion) || p.esIgual(objPosicion)) return i;
        }
        return -1;
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
    public void setJugador(Personaje j){
        this.j = j;
    }
}
