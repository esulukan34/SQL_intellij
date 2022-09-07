package jdbcPractise;

import java.sql.*;
import java.sql.DriverManager;

public class Query01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1) Driver yukle
        Class.forName("org.postgresql.Driver");

        //2) Baglanti olustur
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                                                     "postgres",
                                                     "2101emre");

        //3) Statement
        Statement st = con.createStatement();// olusturdugumuz adresi statement objesine bagladik

        // 4) ResulSet --> sorgulama yaptigimizda bize cevap dondurecek onlari saklamak icin olusturduk
        ResultSet veri = st.executeQuery("select * from ogrenciler");

        //5) Sonuclari al
        while(veri.next()){ // veri.next ile tek tek bilgileri aldik

            // index kullanarak
            System.out.println(veri.getInt(1)+ veri.getString(2)+ veri.getString(3)+veri.getString(4));

            // sutun ismi kullanarak
            System.out.println(veri.getInt("okul_no")+veri.getString("ogrenci_ismi")+ veri.getString("sinif")+veri.getString("cinsiyet"));

        //6) Kapatma
            con.close();
            st.close();
            veri.close();


        }
    }
}
