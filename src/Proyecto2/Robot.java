package Proyecto2;

public class Robot{
    private float peso;
    Pieza sinIdentificar;
    CPU cpu;
    Bateria bateria;
    public Robot(){
        this.cpu = new CPU();
        this.cpu.setNumSerie("rc550ART");
        this.bateria = new Bateria();
        this.bateria.setPeso(250f);
    }
    public void setPeso(float peso) {
        if(peso<0)
            this.peso = 0;
        else
            this.peso = peso;
    }
    public float getPeso() {
        return this.peso;
    }


}
