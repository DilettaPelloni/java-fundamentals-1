package org.lessons.java;

//IMPORT
import java.util.Scanner;

public class GetTicketPrice {
    public static void main(String[] args) {

        //creo un'istanza di scanner
        Scanner getInput = new Scanner(System.in);

        //chiedo all'utente il numero di chilometri
        System.out.println("Inserisci il numero di km da percorrere:");
        int km = getInput.nextInt();

        //chiedo all'utente l'età
        System.out.println("Inserisci l'età del passeggero:");
        int age = getInput.nextInt();

        //stampo gli input
        System.out.println(km);
        System.out.println(age);

    }
}
