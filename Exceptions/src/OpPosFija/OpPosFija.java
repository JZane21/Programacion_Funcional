package OpPosFija;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class OpPosFija {
    public static void main(String[] args) {
        String palabra = p();
        Queue<Character>c1 = new LinkedList<Character>();
        Queue<Character>c2 = new LinkedList<Character>();
        palabra.chars().filter(i->(char)i!=' '
        &&(char)i!='+'&&(char)i!='*'
        &&(char)i!='-'&&(char)i!='/')
        .forEach(i->((LinkedList<Character>) c1).push((char)i));

        palabra.chars().filter(i->(char)i!=' '
        &&(char)i=='+'&&(char)i=='*'
        &&(char)i=='-'&&(char)i=='/')
        .forEach(i->((LinkedList<Character>) c2).push((char)i));

        System.out.println(c1);
        System.out.println(c2);
    }
    public static String p(){
        return new Scanner(System.in).nextLine();        
    }
}
