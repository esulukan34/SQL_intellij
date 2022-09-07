package jdbcPractise;

import java.sql.*;

public class Query04 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                                                     "postgres",
                                                  "2101emre");

        //Statement st = con.createStatement();--> bunun yerine prepareStatement kullaniyoruz, daha dinamik ,daha az yer kapliyor

        PreparedStatement  ps = con.prepareStatement("insert into ogrenciler values(?, ?, ?, ?)");
        ps.setInt(1,200);
        ps.setString(2,"Emre Sulukan");
        ps.setString(3,"12");
        ps.setString(4,"E");

        ps.executeUpdate();

        System.out.println("Veri girisi yapildi");

    }
}
