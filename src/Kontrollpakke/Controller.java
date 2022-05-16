package Kontrollpakke;

import DBpakke.Database;
import Domenepakke.Ansatt;
import Domenepakke.Film;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.TreeMap;

public class Controller {
    Database db = new Database();
    ArrayList<Film> filmer = new ArrayList<>();
    TreeMap<String,Ansatt> login = new TreeMap<>();


    //Lager her en metode for å hente ut ansatte for login funksjon
    public void hentAnsatte() throws Exception{
        //Klarerer arrayen i tilfelle slik at man har riktig informasjon i den
        login.clear();
        try{
            ResultSet resultat = db.lesLogin();
            while(resultat.next()){
                String brukerNavn = resultat.getString(1);
                Double pinKode = resultat.getDouble(2);
                Boolean erPlanlegger = resultat.getBoolean(3);
                //Kan legge til en klausul her og lage 2 lister som differensierer mellom ansatte og planleggere
                login.put(brukerNavn, new Ansatt(brukerNavn,pinKode,erPlanlegger));

            }
        } catch (Exception e) {throw new Exception("Får ikke hentet ansatte fra DB");}

    }

    //Metode for å logge inn
    public Ansatt loginAnsatt(String brukernavn, Double pinkode){
        Ansatt spesifikkAnsatt = login.get(brukernavn);
        //Bruker double.compare for å se om det er like verdier, om det er like verdier er resultatet 0
        if(Double.compare(spesifikkAnsatt.getPinKode(), pinkode) == 0){
            return spesifikkAnsatt;
        }
        return null;
    }


    //Metode for å hente filmer som går på kinoen
    public void hentFilmer() throws Exception{
        //Klarerer arrayen som inneholder filmer
        filmer.clear();
        try{
            ResultSet resultat = db.lesFilm();
            while(resultat.next()){
                Integer filmNr = resultat.getInt(1);
                String filmNavn = resultat.getString(2);
                filmer.add(new Film(filmNr,filmNavn));
                //Kun for å sjekke at connection mellom db og java fungerte
            }

        }  catch (Exception e) {throw new Exception("Får ikke hentet filmer fra DB"); }
    }

    public void skrivUtFilmer(){System.out.println(filmer);}
    public void skrivUtBrukere(){System.out.println(login);}




}
