package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Voorraad {
    ArrayList<Drank> dranken;

    public Voorraad() {
        this.dranken = new ArrayList<>();
    }

    public void voegDrankToe (Drank drank) {
        dranken.add(drank);
    }

    @Override
    public String toString() {
        Collections.sort(dranken);
        StringBuilder stringBuilder = new StringBuilder();
        for (Drank drank : dranken) {
            stringBuilder.append(drank).append("\n\n");
        }
        return stringBuilder.toString();
    }

    public void printBewaarWijnen() {
        for (Drank drank : dranken) {
            if (drank.getBewaarWijn()) {
                System.out.println(drank + "\n");
            }
        }
    }

    public void printBedorvenDranken() {
        File drankenBestand = new File("resources/dranken.txt");

        try (PrintWriter printWriter = new PrintWriter(drankenBestand)) {
            for (Drank drank : dranken) {
                if (LocalDate.now().isAfter(drank.bepaalHoudbaarTot())) {
                    printWriter.println(drank + "\n");
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Het is niet gelukt het bestand aan te maken of die te openen.");
        }
    }
}
