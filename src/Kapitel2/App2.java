package Kapitel2;

/***
 * Errechnung des BMI Wertes
 * bmi = Körpergewicht / Körpergröße * Körpergröße
 * Explizites Casting kennenlernen
 *
 */

public class App2 {
    public static void main(String[] args) {
        float gewicht = 17.0f; //Variable deklarieren und initialiesien
        float größe = 0.75f;
        float bmi = gewicht / (größe * größe);//Berechnung des bmi
        System.out.printf(
                "Das Gewicht %.2f kg und die größe %.2fm " +//Aliase (%f für Fließkomma und .2 für 2 Kommazahlen)
                        "ergeben einen BMI Wert von %.2f", gewicht, größe, bmi);
    }
}
