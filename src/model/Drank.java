package model;

import java.time.LocalDate;

public abstract class Drank implements Comparable<Drank> {
    private String naam;
    private LocalDate brouwDatum;
    private double prijs;

    public Drank(String naam, LocalDate brouwDatum, double prijs) {
        this.naam = naam;
        this.brouwDatum = brouwDatum;
        this.prijs = prijs;
    }

    public abstract LocalDate bepaalHoudbaarTot();

    @Override
    public int compareTo(Drank andereDrank) {
        return this.naam.compareTo(andereDrank.naam);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f euro per fles\nHoudbaar tot %s", this.naam, this.prijs, this.bepaalHoudbaarTot());
    }

    public double getPrijs() {
        return prijs;
    }

    public LocalDate getBrouwDatum() {
        return brouwDatum;
    }

    public boolean getBewaarWijn() {
        return false;
    }
}
