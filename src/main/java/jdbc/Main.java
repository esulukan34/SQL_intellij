package jdbc;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        //DBWork objesini olustur
        DBWork db = new DBWork();
        Connection con = db.connect_to_db("techproed", "postgres", "2101emre");





    }
}
