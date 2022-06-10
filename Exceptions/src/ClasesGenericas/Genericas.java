package ClasesGenericas;

import java.util.List;

import Excepciones.Estudiante;
import Pila.Pila;

public class Genericas {
    public static void main(String[] args) {
        System.out.println("-----Tipos de datos nativos-----");
        //Estos datos no pueden ser nulos
        int x;
        short y;
        long z;
        byte e;
        float f;
        double d;
        boolean b;
        char c;

        System.out.println("-----Tipos de datos Avanzados-----");
        //Estos si pueden ser nulos
        String s = null;
        Integer x2;
        Short y2;
        Long z2;
        Byte e2;
        Float f2;
        Double d2;
        Boolean b2;
        Character c2;

        //clase generica:
        Pila pila = new Pila();
        Integer[] array = {2,3,4,2,3};
        pila.setValores(array);
        System.out.println(pila.toString());        
        
        List<Integer> listaEnteros = List.of(2,3,4);
        System.out.println(promedio(listaEnteros));
    
        operacion(1,2,3,4,5);
    
        /*
         * Para el Sabado: 11/06/2022
         * Algoritmo para evaluar operaciones en notacion
         * posfija(Opcional)
         */

        /*
         * Para el Lunes: 13/06/2022
         * Investigar:
         * que es SOLID?(Por puntaje)
         * 
         * Clase si y solo si debe trabajar
         * en su propio entorno
         * 
         * Cada clase es responsable de hacer una
         * unica cosa
         * 
         * Min de 3 hojas
         */
    }
    public static <T> String promedio(List<T> lista){
        String texto = "";
        for(T listas:lista){
            texto = texto + lista + ",";
        }
        return texto;    
    }
    public static void operacion(Integer...numeros){
        
    }
}
