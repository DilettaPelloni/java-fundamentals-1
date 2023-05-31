package org.lessons.java;

public class FizzBuzz {
    public static void main(String[] args) {

        //Stabilisco il totale dei numeri da mostrare
        int totalNumbers = 100;

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
