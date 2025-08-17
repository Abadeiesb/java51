package Aula07;

import java.util.Scanner;

public class Whiles {
    public static void main(String[] args) {
        //Scanner s =  new Scanner(System.in);
        sout("Enter 5 numbers ");
        //int inputNumber=0;
        int contador=0;
     while(contador < 10){
         contador++;
         sout("Repetições: " + contador);
     }
        sout("O valor de guardado em contador é "+contador);
    }



    static void sout (String texto){
        System.out.println(texto);


    }
}
