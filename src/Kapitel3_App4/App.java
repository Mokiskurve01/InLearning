package Kapitel3_App4;
/***
 * Auf Eigenschaftsfelder zugreifen
 * Methoden aufrufen
 * Variablen übergeben (by Value/by Reference)_BMIRechner
 * Arrays aus Objekten erzeugen
 * Die Sichtbarkeit festlegen
 *
 */
public class App {
    public static void main(String[] args) {
        BMIRechner bmiRechner = new BMIRechner();
        Hund[] hund = new Hund[2];//Datenreihe aus Hund-Objekten
        hund[0] = new Hund();// Hund erschaffen und kann mit der Zuweisung ihrer Objektvariablen beginnen
        hund[0].name = "Leroy";//Objekt die tatsächlichen Werte für die Objektvariablen zuweisen.
        hund[0].gewicht = 17.0;
        hund[0].groesse = 0.75;
        System.out.println(hund[0].name);
        System.out.println(hund[0].gewicht);
        System.out.println(hund[0].groesse);
        double bmi0 = bmiRechner.rechen(hund[0]);
        System.out.println(bmi0);
        System.out.println();


        hund[1] = new Hund();// Hund erschaffen und kann mit der Zuweisung ihrer Objektvariablen beginnen
        hund[1].name = "Terry";//Objekt die tatsächlichen Werte für die Objektvariablen zuweisen.
        hund[1].gewicht = 16.0;
        hund[1].groesse = 0.75;
        System.out.println(hund[1].name);
        System.out.println(hund[1].gewicht);
        System.out.println(hund[1].groesse);
        double bmi1 = bmiRechner.rechen(hund[1]);
        System.out.println(bmi1);

    }
}
