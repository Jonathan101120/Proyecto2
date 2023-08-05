package Proyecto2;

public class Hadron extends Personaje{
    private boolean visible = true;
    public Hadron(){

    }
    public boolean cambioVisibilidad(){
        if(this.visible)
            this.visible = false;
        else
            this.visible = true;

        return this.visible;
    }
}
