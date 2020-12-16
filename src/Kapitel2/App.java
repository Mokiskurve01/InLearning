package Kapitel2;

import java.util.Locale;

/***
 * Errechnung des BMI Wertes
 * bmi = Körpergewicht / Körpergröße * Körpergröße
 */

public class App {
    public static void main(String[] args) {
        double gewicht = 17.0; //Variable deklarieren und initialiesien
        double größe = 0.75;
        double bmi = gewicht / (größe * größe);//Berechnung des bmi
        System.out.printf(
                "Das Gewicht %.2f kg und die größe %.2fm " +//Aliase (%f für Fließkomma und .2 für 2 Kommazahlen)
                        "ergeben einen BMI Wert von %.2f", gewicht, größe, bmi);
    }
}
