package com.company;

public class Main {

    public static void main(String[] args) {

        int [] arreglo = new int[100];

        for (int i = 0; i < arreglo.length ; i++) {

            arreglo[i] = (int)(Math.random()*100);
        }
        for (int elemento:arreglo){

            System.out.println(elemento+ " ");
        }
    }
}
