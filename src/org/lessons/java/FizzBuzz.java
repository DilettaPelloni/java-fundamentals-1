package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        //creo un'istanza di scanner
        Scanner getInput = new Scanner(System.in);

        //stabilisco il numero minimo e massimo
        int minNum = 0;
        int maxNum = 1000;

        //chiedo all'utente quanti numeri vuole stampare
        System.out.println("Quanti numeri vuoi stampare?");
        System.out.println("Mi raccomando, devono essere più di " + minNum + " e meno di " + maxNum);

        //inizializzo una variabile in cui inserire i numeri da mostrare
        int totalNumbers;

        do {
            //recupero il dato dell'utente
            totalNumbers = getInput.nextInt();
            //messaggio di errore se il numero è troppo piccolo
            if(totalNumbers <= minNum) {
                System.out.println("Il numero non può essere minore di " + minNum + "!");
            }
            //messaggio di errore se il numero è troppo grande
            if(totalNumbers >= maxNum) {
                System.out.println("Il numero non può essere maggiore di " + (maxNum - 1) + "!");
            }
        } while (totalNumbers <= minNum || totalNumbers >= maxNum );

        //chiudo lo scanner
        getInput.close();

        //stampo i numeri da 1 a totalNumbers
        for (int i = 1; i <= totalNumbers; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }  else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
