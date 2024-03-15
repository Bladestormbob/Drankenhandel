package controller;

import database.DBaccess;
import database.WijnDAO;
import model.Bier;
import model.Voorraad;
import model.Wijn;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Dit is het startpunt van het voorraadbeheer-systeem van de slijterij en bevat daarnaast een collectie van tests.
 * @author Bart Falkena
 */
public class SlijterijLauncher {

    public static void main(String[] args) {

        System.out.println("Welkom bij Slijterij 't Lammetje, geschreven door: Bart Falkena\n");

        testStap2();

//        testStap3();

//        Voorraad voorraad = testStap4();
//
//        testStap5(voorraad);
//
//        testStap6(voorraad);
//
//        testStap7(voorraad);

//        DBaccess dBaccess = new DBaccess("Slijterij", "userSlijterij", "userSlijterijPW");
//        dBaccess.openConnection();
//        WijnDAO wijnDAO = new WijnDAO(dBaccess);
//        ArrayList<Wijn> machinisten = wijnDAO.getWijnGoedkoperDanPrijs(10);
//
//        System.out.println("--- Test stap 9 ---");
//        System.out.println();
//
//        for (Wijn machinist : machinisten) {
//            System.out.println(machinist + "\n");
//        }
//
//        dBaccess.closeConnection();
//
//    }
    }
    private static void testStap2() {
        Bier bier1 = new Bier("Hertog Jan Karakter", LocalDate.now().minusMonths(23),
                3.66, 7.5, false);
        Bier bier2 = new Bier("Amstel Pilsener", LocalDate.of(2017, 11, 30),
                1.98, 5, false);
        Bier bier3 = new Bier("La Trappe Dubbel", LocalDate.of(2015, 2, 6),
                6.5, 4.28, true);

        System.out.println("--- Test stap 2 ---");
        System.out.println(bier1);
        System.out.println();
        System.out.println(bier2);
        System.out.println();
        System.out.println(bier3);
        System.out.println();
    }







//    private static void testStap3() {
//        Wijn wijn1 = new Wijn("Château La Tour Carnet 2014", LocalDate.of(2014, 1, 16),
//                35.99, false);
//        Wijn wijn2 = new Wijn("Clos Du Clocher 2016", LocalDate.of(2016, 6, 8),
//                74.99, true);
//        Wijn wijn3 = new Wijn("Amarosso Verona 2015", LocalDate.of(2015, 4, 22),
//                8.75, false);
//        Wijn wijn4 = new Wijn("Domaine Benastra Rouge 2015", LocalDate.of(2015, 10, 30),
//                16.50, true);
//
//        System.out.println("--- Test stap 3 ---");
//        System.out.println(wijn1);
//        System.out.println();
//        System.out.println(wijn2);
//        System.out.println();
//        System.out.println(wijn3);
//        System.out.println();
//        System.out.println(wijn4);
//        System.out.println();
//    }

//    private static Voorraad testStap4() {
//        Voorraad voorraad = new Voorraad();
//
//        Bier bier1 = new Bier("Hertog Jan Karakter", LocalDate.now().minusMonths(23),
//                3.66, 7.5, false);
//        Bier bier2 = new Bier("Amstel Pilsener", LocalDate.of(2017, 11, 30),
//                1.98, 5);
//        Bier bier3 = new Bier("La Trappe Dubbel", LocalDate.of(2015, 2, 6),
//                4.28, 6.5, true);
//
//        Wijn wijn1 = new Wijn("Château La Tour Carnet 2014", LocalDate.of(2014, 1, 16),
//                35.99, false);
//        Wijn wijn2 = new Wijn("Clos Du Clocher 2016", LocalDate.of(2016, 6, 8),
//                74.99, true);
//        Wijn wijn3 = new Wijn("Amarosso Verona 2015", LocalDate.of(2015, 4, 22),
//                8.75, false);
//        Wijn wijn4 = new Wijn("Domaine Benastra Rouge 2015", LocalDate.of(2015, 10, 30),
//                16.50, true);
//
//        voorraad.voegDrankToe(wijn1);
//        voorraad.voegDrankToe(bier1);
//        voorraad.voegDrankToe(wijn2);
//        voorraad.voegDrankToe(bier2);
//        voorraad.voegDrankToe(bier3);
//        voorraad.voegDrankToe(wijn3);
//        voorraad.voegDrankToe(wijn4);
//
//        System.out.println("--- Test stap 4 ---");
//        System.out.println("Bieren en wijnen zijn aan de voorraad toegevoegd!");
//        System.out.println();
//
//        return voorraad;
//    }
//
//    private static void testStap5(Voorraad voorraad) {
//        System.out.println("--- Test stap 5 ---");
//        System.out.println(voorraad);
//        System.out.println();
//    }
//
//    private static void testStap6(Voorraad voorraad) {
//        System.out.println("--- Test stap 6 ---");
//        voorraad.printBewaarWijnen();
//        System.out.println();
//    }
//
//    private static void testStap7(Voorraad voorraad) {
//        System.out.println("--- Test stap 7 ---");
//        voorraad.printBedorvenDranken();
//        System.out.println();
//    }

}