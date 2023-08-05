package Proyecto2;

public class CPU extends Pieza{
    int cache;
    public CPU(){
        this.cache = 4;
    }
    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }
}
