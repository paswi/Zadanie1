package pl.gda.wsb.zadanie1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class zadanie {

    public static void main(String[] args) {
        int rangeLower =1 ;
        int rangeUpper;
        int attempts;
        int randomNumber;
        int proposedNumber;

        Scanner readerObj = new Scanner(System.in);

        System.out.println("Wylosuj liczbę z przedziału od 1 do ?");
        rangeUpper = readerObj.nextInt();

        randomNumber = ThreadLocalRandom.current().nextInt(rangeLower, rangeUpper +1);

        System.out.println("Ile prób chciałbyś mieć na odgadniecie liczby");
        attempts = readerObj.nextInt();

        System.out.println("Wylosowano liczbę. Zgadnij która. Masz " + attempts +" podejść.");

        for (int i=1; i<= attempts; i++ ){
            System.out.println("\nPodejście " + i + ":");
            System.out.println("Podaj liczbe " + i + ":");
            proposedNumber = readerObj.nextInt();

            if(proposedNumber==randomNumber && i< attempts){
                System.out.println("Gratulacje, udało Ci się!");
                break;
            }else if (proposedNumber > randomNumber && i< attempts){
                System.out.println("Podano za dużą liczbe");
            }else if (proposedNumber < randomNumber && i< attempts){
                System.out.println("Podano za niską liczbe");
            }else if (i == attempts){
                System.out.println("\nPrzekroczono liczbe prób. Liczba to " + randomNumber);
            }
        }
        System.out.println("\nDziękuję za grę.");
    }
}

