package Practica4;

import java.util.List;

public class Practica4 {
    public static void main(String[] args) {
        Persona persona = new Persona("Pepe",27,1);
        Persona persona2 = new Persona("Dylan",26,2);
        Persona persona3 = new Persona("Charles",24,3);
        Persona persona4 = new Persona("Logan",23,4);
        Cuenta cuenta = new Cuenta(persona, 1000001);
        Cuenta cuenta2 = new Cuenta(persona2, 1);
        CuentaJoven cuentaJoven = new CuentaJoven(persona3
        , 1000001, 7);
        CuentaJoven cuentaJoven2 = new CuentaJoven(persona4
        , 1, 9);
        List<Cuenta> cuentas = List.of(cuenta,cuenta2);
        List<CuentaJoven> cuentaJovenes = List.of(cuentaJoven,cuentaJoven2);
        Banco banco = new Banco(cuentas, cuentaJovenes);
        banco.obtenerClientesVIP().stream()
        .forEach(i->System.out.println(i.getNombre()));    
    }
}
