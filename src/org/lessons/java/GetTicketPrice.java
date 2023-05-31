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

        //stabilisco il prezzo unitario
        double unitPrice = 0.21;

        //calcolo il prezzo del biglietto
        double price = km * unitPrice;

        //applico eventuali sconti
        if(age < 18){
            price = price*80/100;
        }
        if(age > 65) {
            price = price*60/100;
        }

        //stampo il prezzo finale
        System.out.println("Il prezzo del biglietto è: " + price + "€");

    }
}
