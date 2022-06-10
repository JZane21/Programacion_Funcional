package POO;

public class Notaciones {
    public static void main(String[] args) {
        //notacion infija:
        String operacion = "5 + 4";
        //prefija:
        String operacionPrefija = "+ 5 4";
        //posfija:
        String operacionPosfija = "5 4 +";

        //notacion infija:
        String operacion2 = "3+4-9*80/2";
        //convertir a notacion prefija:
        String operacionPosfija2 = "+3-4*9/80 2";
        

        int resultado1 = eval(operacion);


        String op3 = "5 * 7 + 8 / 2 - 5";
        //String op3PreFija = "* 5 + 7 / 8 - 2 5";
        //String op3PosFija = "5 7 * 8 + 2 / 5 -";

        //prefija:
        String op3PreFija = "- + *5 7 / 8 2 5";
        //posfija:
        //String op3PosFija = "5 5 7 * 2 8 / + -";
        
        String op4 = "5*9+10/2-21/3";
        //prefija:
        String op4PreFija = "+ - * 5 9 / 10 2 / 21 3";
        //posfija:
        String op5PosFija = "9 5 * 10 2 / + 21 3 / -";

        String op5 = "20/4-5+27/3";
        //posfijo:
        String op5PosFijo = "20 4 / 5 - 27 3 / +";
    }
    public static int eval(String operacion){

        return 0;
    }
}
