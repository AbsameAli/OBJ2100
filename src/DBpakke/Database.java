package DBpakke;

import java.sql.*;

//Oppretter her klassen database, dette er klassen som har all kommunikasjon med databasen.
public class Database {
    //Oppretter her variabler med detaljer for å kunne koble til databasen
    private String dbNavn = "jdbc:mysql://localhost:3306/kino";
    private String dbDriver = "com.mysql.jdbc.Driver";
    //Initialiserer her forskjellige variabler vi kommer til å bruke for kommunikasjon med DB
    private Connection dbForbindelse;
    private ResultSet resultat;
    private Statement dbUtsagn;

    //Lager her forbindelse til databasen, med de kredentsialene vi har fått
    public void lagForbindelse() throws Exception{
        try{
            dbForbindelse = DriverManager.getConnection(dbNavn,"Case","Esac");
            dbForbindelse.setAutoCommit(false);
        } catch (Exception e){throw new Exception("Kan ikke oppnå kontakt med DB"); }
    }

    public void lukk() throws Exception {
        try{
            if(dbForbindelse != null){
                dbForbindelse.close();
                resultat.close();
                dbUtsagn.close();
            }
        } catch (Exception e){ throw new Exception("Får ikke lukket forbindelsen til DB"); }
    }

    public ResultSet lesLogin() throws Exception{
        lagForbindelse();
        ResultSet resultat = null;
        String sql = "SELECT * FROM tbllogin";
        try{
            dbUtsagn = dbForbindelse.createStatement();
            resultat = dbUtsagn.executeQuery(sql);
        }catch (Exception e) { throw new Exception("Kan ikke utføre spørring"); }
        return  resultat;
    }

    public ResultSet lesFilm() throws Exception{
        lagForbindelse();
        ResultSet resultat = null;
        String sql = "SELECT * FROM tblfilm";
        try{
            dbUtsagn = dbForbindelse.createStatement();
            resultat = dbUtsagn.executeQuery(sql);
        } catch (Exception e) {throw new Exception("Får ikke utført spørring"); }
        return resultat;
    }






}

