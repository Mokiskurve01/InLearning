package Kapitel3_App5;

/***
 * Auf Eigenschaftsfelder zugreifen
 * Methoden aufrufen
 * Variablen übergeben (by Value/by Reference)_BMIRechner
 * Arrays aus Objekten erzeugen
 * Die Sichtbarkeit festlegen
 * Das Schlüsselwort "private" nutzen(setter-getter)
 *
 */
public class App {
    public static void main(String[] args) {
        BMIRechner bmiRechner = new BMIRechner();
        Hund[] hund = new Hund[2];//Datenreihe aus Hund-Objekten
        hund[0] = new Hund();// Hund erschaffen und kann mit der Zuweisung ihrer Objektvariablen beginnen
        hund[0].setName("Leroy");
        hund[0].setGewicht(17);
        hund[0].setGroesse(0.75);
        System.out.println(hund[0].getName());
        System.out.println(hund[0].getGewicht());
        System.out.println(hund[0].getGroesse());
        double bmi0 = bmiRechner.rechen(hund[0]);
        System.out.println(bmi0);
        System.out.println();


        hund[1] = new Hund();// Hund erschaffen und kann mit der Zuweisung ihrer Objektvariablen beginnen
        hund[1].setName("Terry");
        hund[1].setGroesse(16);
        hund[1].setGroesse(0.74);
        System.out.println(hund[1].getName());
        System.out.println(hund[1].getGroesse());
        System.out.println(hund[1].getGroesse());
        double bmi1 = bmiRechner.rechen(hund[1]);
        System.out.println(bmi1);

    }
}
