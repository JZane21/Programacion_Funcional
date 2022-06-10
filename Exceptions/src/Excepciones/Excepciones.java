package Excepciones;

import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones{
    public static void main(String[] args) {
        
        try{
            byte numero = leerNumero();

            byte numero2 = leerNumero();

            System.out.println("Division: "+numero/numero2);

            Estudiante estudiante = new Estudiante();
            estudiante.faltas=5;


        }catch(InputMismatchException exception){
            System.out.println("No digito un numero");
        }catch(ArithmeticException exception){
            System.out.println("El divisor no puede ser cero");
        }
    }
    public void validar(Estudiante e) throws UPBException{

    }
    public static Byte leerNumero(){
        try{
            System.out.print("Digite un numero: ");
            return new Scanner(System.in).nextByte();
        }catch(InputMismatchException exception){
            System.out.println("No digito un numero\nvuelva a intentarlo");
            return leerNumero();
        }
    }
}