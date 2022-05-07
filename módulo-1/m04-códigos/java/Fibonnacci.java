package main;

import java.util.Scanner;

public class Fibonnacci {
    public static void main(String args[]){
        System.out.println("Dame un numero: ");
        Scanner scaner = new Scanner(System.in);
        int numero = scaner.nextInt();
        int a = 1;
        int b = 1;
        int c;

        System.out.println(a);
        System.out.println(b);

       for(int i = 3; i <= numero; i++) {

           c = a + b;
           a = b;
           b = c;

           System.out.println(c);
       }
    }
}
