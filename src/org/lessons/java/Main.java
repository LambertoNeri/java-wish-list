package org.lessons.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //BONUS LETTURA FILEè

        System.out.println("The gift list already contains: ");

        //provo a leggere il file
        Scanner fileReader = null;

        // provo a scrivere sul file e se si alzano eccezioni le intercetto
        try {
            fileReader = new Scanner(new File("./resources/data.txt"));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
        //chiudo BONUS LETTURA
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
            if (!exit) {

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
                System.out.println("New list total gifts counter is: " + giftList.size());
                System.out.println("Follow instructions to add a new gift or end the program");
                System.out.println("*********************************************************");
            }
        }

        System.out.println("Program shutting down...");
        System.out.println("Following you'll find the complete list of the latest gifts added: ");
        System.out.println(giftList.toString());

        //BONUS SCRITTURA FILE

        //inizializzo fileWriter a null
        FileWriter fileWriter = null;
        
        //provo ad aprire il fileWriter

        
        //provo a scrivere sul file

        try{

            fileWriter = new FileWriter("./resources/data.txt", true);
            fileWriter.write(giftList.toString());

        }catch (IOException e) {
            System.out.println("unable to write file");
        } finally {
            try{
                if (fileWriter != null) {
                    System.out.println("Closing file");
                } fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }




        //chiudo lo scanner
        scanner.close();
    }
}

