package sample;

import DBpakke.Database;
import Domenepakke.Film;
import Kontrollpakke.Controller;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.RandomAccess;


//Sample er vår GUI pakke,
public class Main extends Application {

    //Oppretter her en kobling mot kontroll klassen
    Controller kontroll = new Controller();

    //Dette er gui som skal bli brukt så her deklarerer vi eventuelle vinduer og scener som skal bli brukt
    Scene scene1, scene2;
    Stage vindu;
    Label overskrift;

    //Lager noen observerbare lister her, som kan fremvises i GUI
    private ObservableList<Film> filmData = FXCollections.observableArrayList();


    @Override
    public void start(Stage vindu) throws Exception {
        this.vindu = vindu;
        //Kaller her på kontroll for å fylle listene i minnet
        kontroll.hentFilmer();
        kontroll.skrivUtFilmer();
        kontroll.hentAnsatte();
        kontroll.skrivUtBrukere();

        System.out.println(kontroll.loginAnsatt("usr2",1000.1));

        lagScene1();

    }

    public void lagScene1(){
        //Lager første scene som skal bli vist i programmet
        BorderPane root = new BorderPane();
        Label overskrift = new Label("Kebab");
        scene1 = new Scene(root,500,300);
        root.setTop(overskrift);
        vindu.setScene(scene1);
        vindu.show();
    }


    public static void main(String[] args){launch(args); }
}