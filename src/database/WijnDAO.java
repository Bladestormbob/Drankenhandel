package database;

import model.Wijn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class WijnDAO extends AbstractDAO {

    public WijnDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public ArrayList<Wijn> getWijnGoedkoperDanPrijs (double prijs) {
        ArrayList<Wijn> wijnen = new ArrayList<>();

        String sql = "SELECT wijnnaam, brouwDatum, prijs, bewaarbaar FROM wijn WHERE prijs > ?;";

        try {
            setupPreparedStatement(sql);
            preparedStatement.setDouble(1, prijs);
            ResultSet resultSet = executeSelectStatement();
            while (resultSet.next()) {
                String naam = resultSet.getString(1);
                LocalDate brouwdatum = LocalDate.parse(resultSet.getString(2));
                double kost = resultSet.getDouble(3);
                boolean bewaarbaar = resultSet.getBoolean(4);

                wijnen.add(new Wijn(naam,brouwdatum,kost,bewaarbaar));

            }

        } catch (SQLException sqlException) {
            System.err.println("SQL foutmelding: " + sqlException.getMessage());
        }
        return wijnen;

    }
}
