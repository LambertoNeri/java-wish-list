package org.lessons.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //apro lo scanner
        Scanner scanner = new Scanner(System.in);

        //creo una lista array di Gift
        List<Gift> giftList = new ArrayList<>();

        //creo booleano per uscire dalla richiesta di inserimento regali
        boolean exit = false;

        //chiedo all'utente di inserire regali alla lista

        while (!exit) {
            //chiedo all'utente se vuole inserire o meno un nuovo regalo
            System.out.println("Insert new gift? y/n");
            exit = scanner.nextLine().equals("n");
            if (!exit){

                //chiedo all'utente di inserire nome destinatario
                System.out.println("Insert the name of the gift's recipient");
                //salvo il nome del destinatario
                String recipient = scanner.nextLine();

                //chiedo all'utente di inserire una descrizione del regalo
                System.out.println("Insert a brief description of the gift");
                //salvo la descrizione
                String description = scanner.nextLine();

                //istanzio un nuovo oggetto regalo e ci scrivo i dati salvati
                Gift gift = new Gift(recipient, description);
                //aggiungo il regalo all'array dei regali
                giftList.add(gift);


                //
                System.out.println("Your gift has been added to the list of gifts...");
                //creo una variabile per stabilire
                int counter = giftList.size();
                System.out.println("Total gifts counter is: " + giftList.size());
                System.out.println("Follow instructions to add a new gift or end the program");
                System.out.println("*********************************************************");
            }
        }

        System.out.println("Program shutting down...");
        System.out.println("Following you'll find the complete list of the gifts added");
        System.out.println(giftList.toString());








        //chiudo lo scanner
        scanner.close();
    }
}
