package model;

import java.time.LocalDate;

public class Bier extends Drank {
    public static final int HOUDBAARHEID_BIJ_GIST_IN_FLES = 16;
    public static final int HOUDBAAR_LAAG_ALCOHOLISCH = 9;
    public static final int HOUDBAARHEID_BIJ_HOOG_ALCOHOLISCH = 30;
    private double alcoholpercentage;
    private boolean gistInFles;


    public Bier(String naam, LocalDate brouwDatum, double prijs, double alcoholpercentage) {
        super(naam, brouwDatum, prijs);
        this.alcoholpercentage = alcoholpercentage;


    }

    public Bier(String naam, LocalDate brouwDatum, double prijs, double alcoholpercentage, boolean gistInFles) {
        this(naam, brouwDatum, prijs, alcoholpercentage);
        this.gistInFles = gistInFles;

    }

    @Override
    public LocalDate bepaalHoudbaarTot() {

        if (gistInFles) {
           return getBrouwDatum().plusYears(HOUDBAARHEID_BIJ_GIST_IN_FLES);
        } else {
            if (alcoholpercentage <= 5) {
                return getBrouwDatum().plusMonths(HOUDBAAR_LAAG_ALCOHOLISCH);
            } else  {
                return getBrouwDatum().plusMonths(HOUDBAARHEID_BIJ_HOOG_ALCOHOLISCH);
            }
        }

    }

    @Override
    public String toString() {
        return String.format("%s\nAlcoholpercentage: %.2f%%\ngist in fles: %s", super.toString(), alcoholpercentage,
                gistInFles ? "ja" : "nee" );
    }

}

