package model;

import java.time.LocalDate;

public class Wijn extends Drank {
    public static final int ONDER_PRIJSGRENS_WIJN = 35;
    private Boolean bewaarWijn;

    public Wijn(String naam, LocalDate brouwDatum, double prijs, Boolean bewaarWijn) {
        super(naam, brouwDatum, prijs);
        this.bewaarWijn = bewaarWijn;
    }

    @Override
    public LocalDate bepaalHoudbaarTot() {
        LocalDate houdbaarTot = this.getBrouwDatum();
        if (this.getPrijs() < ONDER_PRIJSGRENS_WIJN) {
            if (bewaarWijn) {
                houdbaarTot = this.getBrouwDatum().plusYears(10);
            } else {
            houdbaarTot = this.getBrouwDatum().plusYears(2);
            }

        } else if (this.getPrijs() >= 35) {
            if (bewaarWijn) {
                houdbaarTot = this.getBrouwDatum().plusYears(100);
            } else {
               houdbaarTot = this.getBrouwDatum().plusYears(10);
            }
        }
        return houdbaarTot;
    }

    @Override
    public String toString() {
        return String.format("%s\nBewaarwijn: %s ", super.toString(),
                bewaarWijn ? "ja" : "nee" );
    }

    @Override
    public boolean getBewaarWijn() {
        return bewaarWijn;
    }
}
