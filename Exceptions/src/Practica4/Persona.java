package Practica4;

public class Persona {
    private String nombre;
    private int edad;
    private int CI;

    public Persona(){}
    public Persona(String nombre, int edad, int CI){
        this.nombre = nombre;
        this.edad = edad;
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getCI() {
        return CI;
    }
    public void setCI(int CI) {
        this.CI = CI;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+getNombre()+"\n"+
        "Edad: "+getEdad()+"\n"+
        "CI: "+getCI());
    }

    public boolean esMayorDeEdad(){
        return getEdad()>=21;
    }

}
