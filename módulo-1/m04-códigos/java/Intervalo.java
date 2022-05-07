package main;

import java.util.Scanner;
public class Intervalo {
    public static void main(String args[]){
        System.out.println("Dame un numero: ");
        Scanner scaner = new Scanner(System.in);
        int numero = scaner.nextInt();

        if(numero >= 1 && numero < 5 || numero > 10 && numero <= 15){

            System.out.println("Esta en el intervalo");

        }else{

            System.out.println("No pertenece al intervalo");

        }
        scaner.close();
    }
}