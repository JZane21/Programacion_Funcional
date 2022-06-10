package Practica4;

public class Cuenta {
    private Persona titular;
    private double cantidad;

    public Cuenta(){}
    public Cuenta(Persona titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public Persona getTitular() {
        return titular;
    }
    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    
    public double getCantidad() {
        return cantidad;
    }

    public void ingresar(double cantidad){
        setCantidad(cantidad>=0?this.cantidad+cantidad:
        this.cantidad);
    }

    public void retirar(double cantidad){
        setCantidad(cantidad>=0?this.cantidad-cantidad:
        this.cantidad);
    }

    private void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar(){
        System.out.println("Titular: "+titular.getNombre()+"\n"+
        "CI del titular: "+titular.getCI()+"\n"+
        "Cantidad: "+getCantidad());
    }

}
