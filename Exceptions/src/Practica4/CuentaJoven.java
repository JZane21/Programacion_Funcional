package Practica4;

public class CuentaJoven extends Cuenta{
    private double bonificacion;

    public CuentaJoven(Persona titular, double cantidad,double bonificacion){
        super(titular,cantidad);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public boolean esTitularValido(){
        return getTitular().esMayorDeEdad()&&getTitular().getEdad()<25;
    }

    @Override
    public void retirar(double cantidad) {
        super.retirar(esTitularValido()?cantidad:0);
    }

    @Override
    public void mostrar() {
        System.out.println("Cuenta Joven\n");
        super.mostrar();
        System.out.println("Bonificacion: "+bonificacion);
    }
}
