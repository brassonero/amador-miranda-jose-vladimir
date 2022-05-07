package main;

import java.util.Arrays;
import java.util.Scanner;
public class SumaLista {
    public static void main(String args[]){
        System.out.println("Ingresa el tamaño de la lista");
        Scanner scaner = new Scanner(System.in);
        int tamaño = scaner.nextInt();
        int array[] = new int [tamaño];
        int sum = 0;
        System.out.println("Ingrese los elementos de la lista uno por uno");

        for(int i=0; i<tamaño; i++){
            array[i] = scaner.nextInt();
            sum = sum + array[i];
        }
        //System.out.println("Elements of the array are: "+ Arrays.toString(array));
        System.out.println("La suma de la lista es: "+sum);
    }
}