package Proyecto2;

public class Personaje {
    //Se crearon los atributos de personaje
    private String nombre;
    private Posicion pos;
    public Personaje(){
        System.out.println("Creamos un personaje.");
    }

    //Se llamaron a los geters y seters para cada atributo
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Posicion getPos() {
        return pos;
    }
    public void setPos(Posicion pos) {
        this.pos = pos;
    }
}