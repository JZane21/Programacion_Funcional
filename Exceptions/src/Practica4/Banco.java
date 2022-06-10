package Practica4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {
    private List<Cuenta>cuenta = new LinkedList<>();
    private List<CuentaJoven>cuentaJoven = new LinkedList<>();

    public Banco(List<Cuenta>cuenta,List<CuentaJoven>cuentaJoven){
        this.cuenta = cuenta;
        this.cuentaJoven = cuentaJoven;
    }

    public List<Cuenta> getCuenta() {
        return cuenta;
    }

    public void setCuenta(List<Cuenta> cuenta) {
        this.cuenta = cuenta;
    }

    public List<CuentaJoven> getCuentaJoven() {
        return cuentaJoven;
    }

    public void setCuentaJoven(List<CuentaJoven> cuentaJoven) {
        this.cuentaJoven = cuentaJoven;
    }

    public double obtenerTotal(){
        return cuenta.stream()
        .map(i->i.getCantidad()).reduce((double)0,(a,b)->a+b) +
        cuentaJoven.stream().map(i->i.getCantidad())
        .reduce((double)0,(a,b)->a+b)+
        cuentaJoven.stream().map(i->i.getBonificacion())
        .reduce((double)0,(a,b)->a+b)*cuentaJoven.size();
    }

    public List<Persona> obtenerClientesVIP(){
        List<Persona> people = new ArrayList<Persona>(
            cuenta.stream().filter(i->i.getCantidad()>1000000)
            .map(i->i.getTitular()).collect(Collectors.toList()));
        people.addAll(cuentaJoven.stream().filter(i->i.getCantidad()>1000000)
            .map(i->i.getTitular()).collect(Collectors.toList()));
        return people;
    }
}