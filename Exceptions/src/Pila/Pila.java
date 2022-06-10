package Pila;

import java.util.Arrays;

public class Pila<T> {
    T[] valores;
    public void setValores(T[] valores){
        this.valores = valores;
    }
    @Override
    public String toString() {
        return "pila{"+"valores="+Arrays.toString(valores)+"}";
    }
}
